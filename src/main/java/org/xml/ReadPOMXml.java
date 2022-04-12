package org.xml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class ReadPOMXml {
    public static void main(String[] args) throws IOException, XmlPullParserException {
      String path="C:\\Users\\nilthapa\\AnypointStudio\\PoC\\javaInvokeStatic\\pom.xml";
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model = reader.read(new FileReader(path));
        
        
        
        
        Boolean isPom=true;
        
//        System.out.println(model.getId());
//        System.out.println(model.getGroupId());
//        System.out.println(model.getArtifactId());
//        
//        System.out.println(model.getDependencies());
        List list= model.getDependencies();
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
//          System.out.println(itr.next());
//          Object arr= itr.next();
//          System.out.println();
          
          Dependency dependency = (Dependency) itr.next();
//          System.out.println(dependency.getArtifactId());

          if( dependency.getArtifactId() == "munit-runner")
          {
            isPom=false;
          
          }
        }
        if(isPom) {
          System.out.println("checking............");
          Dependency dep= new Dependency();
          dep.setGroupId("com.mulesoft.munit");
          dep.setArtifactId("munit-runner");
          dep.setVersion("2.3.7");
          dep.setClassifier("mule-plugin");
          model.addDependency(dep);
          MavenXpp3Writer writter= new MavenXpp3Writer();
          writter.write(new FileWriter(path), model);
          System.out.println("success..........");
        }
        

    }
}

