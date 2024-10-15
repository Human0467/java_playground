package src.client;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        
        /* 

        // this gives a warning - ArrayList is a raw type
        ArrayList myList = new ArrayList();
        // see issue: can add any data type. Anything that goes in will be 
        // considered an Object.
        myList.add("hello");
        myList.add(10);
        myList.add(false);

        // see below - even though we put in a string, we can't assign it to 
        // a string as it is treated as an object. Need to cast
        String myVal = (String) myList.get(0);

        // check definition of ArrayList - it is a generic class
        // public class ArrayList<E> 
        // it wants us to specify a type using <>
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("hello");
        myStringList.add("there");
        // we can now only add Strings. This is type safety.

        // generics allow more flexibility while retaining type safety
        // ArrayList<E> means it can accept any type, but is still typed, it is a generic class

        */

        Container<Integer, String> container = new Container<>(12, "Hello");

        int val1 = container.getItem1();

        // not allowed - compiler type safety checks don't allow
        //int val2 = container.getItem2();

        String val2 = container.getItem2();
        container.printItems();

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");
        mySet1.add("fourth");

        Set<String> mySet2 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");
        mySet1.add("fiftth");

        Set<String> resultSet = union(mySet1, mySet2);

        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    // we can also create generic methods

    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
