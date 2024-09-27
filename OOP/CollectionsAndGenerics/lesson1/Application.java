package OOP.CollectionsAndGenerics.lesson1;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {

        /* 
            // when using an array, we need to declare the size up front - 
            // fixed size data structure
            // Collections framework makes it easier
            // int[] myArr = new int[10];

            // ArrayList is used instead, it's a resizeable array
            // It creates an array with 10 slots, if we try to add an 11th element
            // it makes a new 20 slot array and copies the existing items across.
            // If you try to add a 21st element, it doubles again to 40 slots

            ArrayList words = new ArrayList();
            words.add("hello");
            words.add("there");
            words.remove(0);
            words.add(9);
            words.add('H');

            // won't work without (String) since what we get back from words is an object,
            // even though we know a string is stored there. Need to cast
            String item1 = (String) words.get(0);
            Object item2 = words.get(1);
        */

            // Generics make things a lot easier! in java 5+
            ArrayList<String> words = new ArrayList<String>();
            words.add("hello");
            words.add("there");

            String item1 = words.get(0);
            String item2 = words.get(1);

            // this won't work. Need to use a reference type in the <>. int does not have a class
            // LinkedList<int> numbers = new LinkedList<int>();
            // -- 
            // need to use wrapper class Integer
            
            LinkedList<Integer> numbers = new LinkedList<Integer>();
            // numbers.add("test"); <--- won't work since not an int
            numbers.add(10);
            numbers.add(20);
            numbers.add(149);

            // linked list uses node objects in the implementation, whereas the
            // arrayList is based on an array.
            // linked list does not work in the same way, it attaches data like a train
            // when you add another element, it doesn't need to copy all the existing ones
            // across like in an array. It is better for manipulating the data.
            // An array list is much faster for retrieval, whereas a linked list has to traverse
            // all the items.

            // LINKED LIST - fast manipulation, slow retrieval
            // ARRAY LIST - fast retrieval, slow manipulation

            for(int number : numbers){
                System.out.println(number);
            }
        }


}
