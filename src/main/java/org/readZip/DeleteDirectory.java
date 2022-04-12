package org.readZip;

import java.io.File;

public class DeleteDirectory {

 public static void deleteDirectory(File file)
 {

     for (File subfile : file.listFiles()) {

         if (subfile.isDirectory()) {
             deleteDirectory(subfile);
         }
        
         subfile.delete();
     }
     System.out.println("folder deleted");
 }

 public static void main(String[] args)
 {

     String filepath = "src/main/resources/output/";
     File file = new File(filepath);

     deleteDirectory(file);

     file.delete();
 }
}
