package OOP.fileHandling;

public class MyFileUtils {
    public int subtract10FromLargerNumber(int num) throws FooRuntimeException{
        if(num < 10){
            System.out.println("I'm here!");
            throw new FooRuntimeException("Number is less than 10. Please enter a larger number");
        }
        return num - 10;
    }

    // since Exceptions are just classes, we can also create our own exception classes.
    // ...however, Java has a large number of exceptions so we probably won't need to do this.
    // IF you do, it is best practice to create a new package for them
    public class FooRuntimeException extends Exception{
        public FooRuntimeException(String msg){
            super(msg);
        }
    }
}


