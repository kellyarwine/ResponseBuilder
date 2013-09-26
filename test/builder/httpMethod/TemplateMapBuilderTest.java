package builder.httpMethod;

import builder.code.FourHundredFive;
import builder.code.TwoHundred;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class TemplateMapBuilderTest {
  HashMap templateMap;

  @Before
  public void setUp() {
    TemplateMapBuilder templateMapBuilder = new TemplateMapBuilder();
    templateMap = templateMapBuilder.build();
  }

  @Test
  public void isTemplate() {
    assertThat(templateMap.get(true), instanceOf(TwoHundred.class));
  }

  @Test
  public void isNotTemplate() {
    assertThat(templateMap.get(false), instanceOf(FourHundredFive.class));
  }
}
