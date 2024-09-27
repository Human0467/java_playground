package src.java_basics;

import src.someotherpackage.ExampleClass;

public class LearningMethods {
    public static void main(String[] args) {
        
        // println is a method
        // it accepts a string argument
        // system is the class
        // out is a variable
        // println belongs to out
        System.out.println("this is an argument");

        System.out.println(MyUtils.printSomeJunk("some data"));
        System.out.println(MyUtils.printSomeJunk(100));
        MyUtils.sum2Numbers(10, 7);
        System.out.println(MyUtils.add10(23));
        ExampleClass.doSomething();
    }


}
