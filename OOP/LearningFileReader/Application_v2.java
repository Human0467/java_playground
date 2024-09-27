package OOP.LearningFileReader;

import java.io.File;
import java.io.*;

public class Application_v2 {
    public static void main(String[] args) {

        File file = new File("myFile.txt");

        // try with resources is a more modern approach, avoiding some of the try/catch issues
        // such as having close() in the finally block, which can lead to another exception
        // if the resource didn't actually open correctly

        // these resources will be automatically closed - can get rid of the finally block
        // works in Java 7+
        // the resources must implements Closeable, which extends AutoCloseable
        try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
            ){
            
            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e){
            // we can print a more gentle warning here rather than the 
            System.out.println("file not found");
            //e.printStackTrace();
        // can have multiple catches for one try - need to account for each
        // possible exception that can be thrown, or simply catch Exception since
        // this is the parent class
        } catch (IOException e){
            // e.printStackTrace();
            System.out.println("Problem reading file " + file.getName());
        } 
    }
}
