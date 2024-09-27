package OOP.CollectionsAndGenerics.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        
        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(new Employee("Mike", 3500, "IT"));
        hashSet.add(new Employee("Paul", 3000, "HR"));
        hashSet.add(new Employee("John", 4000, "Cleaning"));
        hashSet.add(new Employee("Sarah", 2000, "C-Suite"));

        // Can't sort a hashset, turn it into a list
        // won't sort until we implement Comparable
        ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(10);

        // if you have a hashlist that you want to turn into an list...
        List<Integer> li = new ArrayList<Integer>(list1);
        // might be useful if you need access to a list method like sort

        // can merge lists using addAll
        list1.addAll(newList);
        System.out.println(list1);

        // can also use removeall to remove all instances of that value
        list1.removeAll(newList);
        System.out.println(list1);

        // clear removes everythin
        //list1.clear();

        // contains 
        boolean hasValue = list1.contains(10);
        System.out.println(hasValue);

        // retainAll removes everythin except for the values you want to retain

    }

}
