package org.xml;

import java.util.UUID;

public class RandomIDGenerator {
  public static void main(String[] args) {
      String uniqueID = UUID.randomUUID().toString();
      System.out.println("Hello, World!"+uniqueID); 
  }
}
