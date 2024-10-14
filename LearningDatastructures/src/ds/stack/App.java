package LearningDatastructures.src.ds.stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> theStack = new Stack<>(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while(!theStack.isEmpty()){
            int value = theStack.pop();
            System.out.println(value);
        }

        String str = "a test string";
        System.out.println("reversing string: " + str);
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        // add all chars to stack
        Stack<String> strStack = new Stack<>(str.length());
        for(String c: str.split("")){
            strStack.push(c);
        }
        String reverserdString = "";
        while(!strStack.isEmpty()){
            reverserdString += strStack.pop();
        }
        return reverserdString;
    }
}
