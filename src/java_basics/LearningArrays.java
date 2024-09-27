package src.java_basics;

public class LearningArrays {
    public static void main(String[] args) {
        
        // need to include type of array, array symbol, array name, size of array
        // e.g. int[] numbers = new int[3]
        // [] and space can be moved
        // int[] numbers, int [] numbers; int numbers[], int numbers [] all work
        int[] values = new int[100];
        values[0] = 1000;
        values[99] = 93432;
        
        System.out.println(values[0]);

        // not initialised, will default to 0
        System.out.println(values[50]);

        System.out.println(values[99]);

        // initialising 
        // this is called an anonymous array as we don't specify type and size.
        String[] words = new String[] {"My", "Name", "is"};
        System.out.println(words[2]);
    }
}
