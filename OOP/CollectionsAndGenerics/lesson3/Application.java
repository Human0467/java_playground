package OOP.CollectionsAndGenerics.lesson3;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {

        // set will not allow duplicates / repeats
        // it goes by Hash codes, not values, so extra care with objects
        // may need to override hasCode() in the object definition
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43);

        // only prints 43 once, even though we added it twice
        // also printed in no particular order
        for(Integer value : values){
            System.out.println(value);
        }

        // if you do need to maintain order (of insertion), use LinkedHashSet
}
}
