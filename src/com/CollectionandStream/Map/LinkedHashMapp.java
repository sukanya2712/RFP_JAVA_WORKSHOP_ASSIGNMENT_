package com.CollectionandStream.Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LinkedHashMapp {
    public static void main(String[] args) {
        System.out.println("Linkedhashmap1");
        Map<Integer, String> map = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "Dave");

        // Displaying the elements of the LinkedHashMap
        System.out.println("LinkedHashMap1 : " + map);
        System.out.println("---------------------------------------------------------");
        System.out.println("linkedhashmap2");
        // Using putAll to add all elements from another Map
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(5, "Emily");
        map2.put(6, "Frank");
        System.out.println("LinkedHashMap2 : " + map2);
        System.out.println();

        map.putAll(map2);
        System.out.println("LinkedHashMap1 Elements after putAll: " + map);
        System.out.println();

        // Using get to retrieve an element by key
        String value = map.get(1);
        System.out.println("Value of key 1: " + value);
        System.out.println();

        // Using remove to remove an element by key
        map.remove(3);
        System.out.println("LinkedHashMap Elements after remove: " + map);
        System.out.println();

        // Using containsKey and containsValue to check if a key or value exists
        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println();

        System.out.println("Contains value Bob: " + map.containsValue("Bob"));
        System.out.println();

        // Using isEmpty and size to check if the map is empty and its size
        System.out.println("Is the map empty? " + map.isEmpty());
        System.out.println();

        System.out.println("Size of the map: " + map.size());
        System.out.println();

        // Using keySet and values to retrieve all keys and values
        System.out.println("Keys of the map: " + map.keySet());
        System.out.println();

        System.out.println("Values of the map: " + map.values());
        System.out.println();

        // Using entrySet to retrieve all key-value pairs
        System.out.println("Entries of the map: " + map.entrySet());
        System.out.println();

        // Using replace to update the value of a key
        map.replace(2, "Bob", "Bobby");
        System.out.println("LinkedHashMap Elements after replace: " + map);
        System.out.println();


        // Using stream to perform operations on LinkedHashMap
        // Filter elements
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("STREAM OPERATIONS");
        System.out.println();

        Map<Integer, String> filteredMap = map.entrySet().stream().filter(entry -> entry.getValue().startsWith("B"))
                                           .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered LinkedHashMap Elements: " + filteredMap);
        System.out.println();

        // Map elements to new values
        Map<Integer, String> mappedMap = map.entrySet().stream()
                                         .collect(Collectors.toMap(Map.Entry::getKey, entry -> "Name: " + entry.getValue()));
        System.out.println("Mapped LinkedHashMap Elements: " + mappedMap);
        System.out.println();

        // Reduce elements
        int sum = map.keySet().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of keys of LinkedHashMap: " + sum);
    }
}
