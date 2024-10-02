package OOP.CollectionsAndGenerics.lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        
        // hashmap won't preserve order, would need to use LinkedHashMap
        // (similar to HashSet vs LinkedHashSet)
        
        // hashmap has key and value, need to identify the data type for both
        // just like arrayList and hashMap, can't have primitive data types
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "ready to face danger");
        dictionary.put("Brilliant", "really good");
        dictionary.put("Joy", "very hapiness");
        dictionary.put("Confidence", "something people have");

        // this will overwrite the existing entry, cannot have dupe keys
        dictionary.put("Confidence", "a definition here");

        // can use for each - but with a difference. Need to use .keySet() or .values();
        for(String word : dictionary.keySet()){
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }

        System.out.println("-----------------");

        // can we loop over keys and values together?
        // entrySet();
        for(Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("-----------------");

        // also a tree map. maintains natural order
        TreeMap<String, String> dictionary1 = new TreeMap<String, String>();
        dictionary1.put("Brave", "ready to face danger");
        dictionary1.put("Brilliant", "really good");
        dictionary1.put("Joy", "very hapiness");
        dictionary1.put("Confidence", "something people have");

        for(Map.Entry<String, String> entry: dictionary1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
