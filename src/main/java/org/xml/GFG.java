package org.xml;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GFG {

  public static void main(String[] args) throws Exception {
    Path p = Paths.get("src/main/resources/org/poc/xmlFile.txt");
    FileInputStream fs = new FileInputStream(p.toAbsolutePath().toString());
    BufferedReader br = new BufferedReader(new InputStreamReader(fs));
    for (int i = 0; i < 4; ++i) {
      br.readLine();
      String lineIWant = br.readLine();
      if(lineIWant.contains("mule")) {
      System.out.println(true);
      }
    }

  }
}
