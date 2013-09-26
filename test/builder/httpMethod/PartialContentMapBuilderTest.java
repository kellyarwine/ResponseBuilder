package builder.httpMethod;

import builder.code.TwoHundredSix;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class PartialContentMapBuilderTest {
  HashMap partialContentMap;

  @Before
  public void partialContent() {
    PartialContentMapBuilder partialContentMapBuilder = new PartialContentMapBuilder();
    partialContentMap = partialContentMapBuilder.build();
  }

  @Test
  public void noPartialContent() {
    assertThat(partialContentMap.get(true), instanceOf(TwoHundredSix.class));
  }
}
