package builder.code;

import junit.framework.Assert;
import org.junit.Test;

public class CodeTest {
  @Test
  public void responseCodeMessage() {
    Assert.assertEquals("", new Code().responseCodeMessage());
  }
}
