package org.readZip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class CreateJavaDir {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
//    Path source = Paths.get("/src/main/resources");
    Path newFolder = Paths.get("src/main/resources" + "/output/");
    System.out.println(Files.createDirectories(newFolder));
  }
  
}
