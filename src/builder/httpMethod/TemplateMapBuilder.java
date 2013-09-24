package builder.httpMethod;

import builder.code.FourHundredFive;
import builder.code.TwoHundred;

import java.util.HashMap;

public class TemplateMapBuilder {
  public HashMap build() {
    HashMap templateMap = new HashMap();
    templateMap.put(true,  new TwoHundred());
    templateMap.put(false, new FourHundredFive());
    return templateMap;
  }
}