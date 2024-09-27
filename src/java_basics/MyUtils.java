package src.java_basics;

// public allows class to be used outside of this package - e.g. in someotherpackage
public class MyUtils {
    /* compiler is smart enough to choose the correct method
     * based on the argument that is passed.
     */
    public static String printSomeJunk(String passedArg){
        return "some blahblahblah " + passedArg;
    }

    // public means we can use the method outside of this class
    public static int printSomeJunk(int passedArg){
        return passedArg;
    }

    // if  private, can only use locally (in this class)
    private static int cantUseThisOutside(int test){
        return test;
    }

    public static void sum2Numbers(int x, int y){
        System.out.println(x + y);
    }

    public static int add10(int x){
        int result = x + 10;
        return result;
    }
}
