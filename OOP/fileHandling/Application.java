package OOP.fileHandling;
import java.util.Scanner;

import src.java_basics.MyUtils;

import java.io.File;
import java.io.FileNotFoundException;

public class Application {
    // System.in is an inputstream
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter some text!:");
        // String enteredText = input.nextLine();
        // System.out.println(enteredText);
        // input.close();

        // TRY block - will try to execute everything in here, if there is an error it will
        // jump to the catch section
        // - alternatively can add a throws ..  to the main method declaration
        try {
            File file = new File("myFile7.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        MyFileUtils myUtils = new MyFileUtils();

        // since subtract10... has a throws.. need to wrap it in a try catch
        // or add the throws to the method that calls it
        try{
            System.out.println(myUtils.subtract10FromLargerNumber(9));
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

    }

}
