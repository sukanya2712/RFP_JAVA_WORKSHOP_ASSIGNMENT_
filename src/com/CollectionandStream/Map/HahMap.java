package com.CollectionandStream.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HahMap {
    public static void main(String[] args) {

        System.out.println("map1 operations");
        Map<String, Integer> map1 = new HashMap<>();

        // Adding elements to the HashMap
        map1.put("apple", 1);
        map1.put("banana", 2);
        map1.put("orange", 3);

        // Displaying the elements of the HashMap1
        System.out.println("HashMap1 : " + map1);
        System.out.println();

        // Removing an element from the HashMap1
        map1.remove("banana");
        System.out.println("Removed an key=banana from the HashMap1 : "+ map1);
        System.out.println();

        // Replacing an element in the HashMap1
        map1.replace("apple", 4);
        System.out.println("Replacing an keyvalue of key apple from 1 to 4 in the HashMap1 : " + map1);
        System.out.println();

        System.out.println("---------------------------------------------------------------");
        System.out.println("map2 operations");
        // Create a new HashMap
        Map<Integer, String> map2 = new HashMap<>();

        // Adding elements to the HashMap
        map2.put(1, "Alice");
        map2.put(2, "Bob");
        map2.put(3, "Charlie");
        map2.put(4, "Dave");
        map2.put(5, "Emily");

        // Displaying the elements of the HashMap
        System.out.println("HashMap Elements: " + map2);
        System.out.println("displaying key and keyvalue : ");
        for (Map.Entry<Integer,String> entry : map2.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("processing map1 data using stream");


        // Updating an element in the HashMap using merge() method
        System.out.println(map1);
        System.out.println("Updating an element in the HashMap using merge() method");
        map1.merge("apple", 2, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Updated HashMap Elements: " + map1);
        System.out.println();

        // Using stream to perform operations on HashMap
        // Filter elements
        System.out.println("filtering elements whose value is greater than 0");
        Map<String, Integer> filteredMap = map1.entrySet().stream().filter(entry -> entry.getValue() > 0)
                                           .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered HashMap Elements: " + filteredMap);
        System.out.println();

        // Map elements to new values
        System.out.println("printing map1 using stream (map) ");
        Map<String, String> mappedMap = map1.entrySet().stream()
                                        .collect(Collectors.toMap(Map.Entry::getKey, entry -> "Value is " + entry.getValue()));
        System.out.println("Mapped HashMap Elements: " + mappedMap);
        System.out.println();

        // Reduce elements
        System.out.println("adding keyvalue's in hashmap");
        int sum = map1.values().stream().reduce(0, Integer::sum);
        System.out.println("Sum of HashMap values: " + sum);


        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Processing map2 using stream");


        // Using stream to perform operations on HashMap
        // Filter elements
        System.out.println("filtering elements whose key is divided by 2");
        Map<Integer, String> filteredMap2 = map2.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered HashMap Elements: " + filteredMap2);
        System.out.println();

        // Map elements to new values
        System.out.println("printing map1 using stream (map) ");
        Map<String, Integer> mappedMap2 = map2.entrySet().stream().
                collect(Collectors.toMap(entry -> entry.getValue().toUpperCase(), Map.Entry::getKey));
        System.out.println("Mapped HashMap Elements: " + mappedMap2);
        System.out.println();

        // Reduce elements
        System.out.println("adding keyvalue's in hashmap");
        int sum2 = map2.values().stream().mapToInt(String::length).sum();
        System.out.println("Sum of lengths of HashMap values: " + sum2);
    }
}
