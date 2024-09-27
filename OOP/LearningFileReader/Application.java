package OOP.LearningFileReader;

import java.io.File;
import java.io.*;

public class Application {
    public static void main(String[] args) {

        // try/catch is prefferred to throws - throws will put the exception in the terminal

        File file = new File("myFile.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        // instead of using a Scanner, can use a FileReader
        try {
            fileReader = new FileReader(file);
            // BufferedReader is able to read the characters from the file,
            // it is more efficient, doesn't read the whole file, goes line by line
            bufferedReader = new BufferedReader(fileReader);

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
        // code will ALWAYS reach the finally block, whether there has been an exception
        // first or not. Good place to close resources.
        } finally {
            try {
                bufferedReader.close(); 
                fileReader.close();
            } catch (IOException e){
                System.out.println("unable to close " + file.getName());
            }
        }
    }
}
