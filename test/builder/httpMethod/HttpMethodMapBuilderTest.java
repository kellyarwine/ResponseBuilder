package builder.httpMethod;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class HttpMethodMapBuilderTest {
  HashMap httpMethodMap;

  @Before
  public void setUp() {
    HttpMethodMapBuilder httpMethodMapBuilder = new HttpMethodMapBuilder();
    httpMethodMap = httpMethodMapBuilder.build();
  }

  @Test
  public void get() {
    assertThat(httpMethodMap.get("GET"), instanceOf(Get.class));
  }

  @Test
  public void post() {
    assertThat(httpMethodMap.get("POST"), instanceOf(Post.class));
  }

  @Test
  public void put() {
    assertThat(httpMethodMap.get("PUT"), instanceOf(Put.class));
  }
}
