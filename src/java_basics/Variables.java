package src.java_basics;

public class Variables {
    public static void main(String[] args) {
        int x = 34;

        System.out.println(x);

        x = 23;

        System.out.println(x+2);
        System.out.println(x);

        // variable naming - can start with letters, _ or $.
        // cannot contain other special characters.
        // cannot start with numbers
        String words;

        words = "this is a sentence!";

        System.out.println(words + " \"adding some words.\"");

        System.out.println("5" + 2);
    }
}
