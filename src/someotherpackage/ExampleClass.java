package src.someotherpackage;

// can import this from another package as it is public
import src.java_basics.MyUtils;

public class ExampleClass {
    
    public static void doSomething(){
        System.out.println(MyUtils.printSomeJunk(10));
    }
}
