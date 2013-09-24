package builder.routeType;

import builder.httpMethod.Get;
import builder.httpMethod.Post;
import builder.httpMethod.Put;

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
