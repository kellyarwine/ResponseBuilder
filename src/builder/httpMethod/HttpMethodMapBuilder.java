package builder.httpMethod;

import java.util.HashMap;

public class HttpMethodMapBuilder {
  public HashMap build() {
    HashMap httpMethodMap = new HashMap();
    httpMethodMap.put("GET", new Get());
    httpMethodMap.put("POST", new Post());
    httpMethodMap.put("PUT", new Put());
    return httpMethodMap;
  }
}