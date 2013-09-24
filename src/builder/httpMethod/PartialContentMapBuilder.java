package builder.httpMethod;

import builder.code.TwoHundred;
import builder.code.TwoHundredSix;

import java.util.HashMap;

public class PartialContentMapBuilder {
  public HashMap build() {
    HashMap partialContentMap = new HashMap();
    partialContentMap.put(true, new TwoHundredSix());
    partialContentMap.put(false, new TwoHundred());
    return partialContentMap;
  }
}