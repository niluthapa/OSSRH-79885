package org.readZip;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipUtilityTest {
  public static void main(String[] args) throws IOException {
    
    Path newFolder = Paths.get("src/main/resources" + "/output/");
    System.out.println(Files.createDirectories(newFolder));
    
      String zipFilePath = "src/main/resources/javacomponents.zip";
      String destDirectory = "src/main/resources/output";
      UnzipUtility unzipper = new UnzipUtility();
      try {
          unzipper.unzip(zipFilePath, destDirectory);
      } catch (Exception ex) {
          // some errors occurred
          ex.printStackTrace();
      }
  }
  
}