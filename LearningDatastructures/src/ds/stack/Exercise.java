package LearningDatastructures.src.ds.stack;

// TODO: Implement the logic for checking valid parentheses using the custom stack
public class Exercise {
    public static boolean isValid(String s) {
        MyStack stack = new MyStack(s.length()); // Create a new stack with size of the input string
        System.out.println(s);
        String opening = "({[";
        // Write logic to push, pop, and check the balance of parentheses
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(opening.indexOf(c) != -1){
                stack.push(c);
            }else if(c == '}' && stack.peak().equals('{') ||
                     c == ']' && stack.peak().equals('[') ||
                     c == ')' && stack.peak().equals('(')){
                         System.out.println("match!");
                         stack.pop();
                     }
        }
        
        
        // Return true if balanced, false if not
        return stack.isEmpty();
    }
}