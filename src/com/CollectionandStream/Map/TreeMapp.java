package com.CollectionandStream.Map;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class TreeMapp {
    public static void main(String[] args) {
        System.out.println("Treemap");
        // Create a new TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements to the TreeMap
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "Dave");
        map.put(5, "Emily");

        // Displaying the elements of the TreeMap
        System.out.println("TreeMap Elements: " + map);


        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Stream Operations ");
        // Using stream to perform operations on TreeMap Filter elements
        Map<Integer, String> filteredMap = map.entrySet().stream().filter(entry -> entry.getKey() > 3) // filter keys greater than 3
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, TreeMap::new));
        System.out.println("Filtered TreeMap Elements: " + filteredMap);
        System.out.println();

        // Map elements to new values
        Map<Integer, String> mappedMap = map.entrySet().stream()
                                         .collect(Collectors.toMap(Map.Entry::getKey, entry -> "Name: " + entry.getKey(), (oldValue, newValue) -> oldValue, TreeMap::new));
        System.out.println("Mapped TreeMap Elements: " + mappedMap);

        // Reduce elements
        int size = map.entrySet().stream().mapToInt(entry -> entry.getValue().length()).sum();
        System.out.println("Size of values of TreeMap: " + size);

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Treemap collection methods");
        // Using other methods of the TreeMap
        System.out.println("Size of TreeMap: " + map.size());
        System.out.println();

        System.out.println("Does the TreeMap contain the key 3? " + map.containsKey(3));
        System.out.println();

        System.out.println("Does the TreeMap contain the value 'Bob'? " + map.containsValue("Bob"));
        System.out.println();

        System.out.println("Entry set of the TreeMap: " + map.entrySet());
        System.out.println();

        System.out.println("First entry of the TreeMap: " + map.firstEntry());
        System.out.println();

        System.out.println("Value for key 2 in the TreeMap: " + map.get(2));
        System.out.println();

        System.out.println("Head map of the TreeMap for key 3: " + map.headMap(3));
        System.out.println();

        System.out.println("Higher entry of the TreeMap for key 3: " + map.higherEntry(3));
        System.out.println();

        System.out.println("Key set of the TreeMap: " + map.keySet());
        System.out.println();

        System.out.println("Last entry of the TreeMap: " + map.lastEntry());
        System.out.println();

        System.out.println("Lower entry of the TreeMap for key 3: " + map.lowerEntry(3));
        System.out.println();

        System.out.println("Putting a new key-value pair in the TreeMap: " + map.put(6, "Frank"));
        System.out.println();

        System.out.println("Removing the key 5 from the TreeMap: " + map.remove(5));
        System.out.println();

        System.out.println("Sub map of the TreeMap from key 2 to 4: " + map.subMap(2, 4));
        System.out.println();

        System.out.println("Tail map of the TreeMap from key 3: " + map.tailMap(3));
        System.out.println();

        System.out.println("Values of the TreeMap: " + map.values());
        System.out.println();

        // Clear the TreeMap
        map.clear();
        System.out.println("TreeMap after clear() method: " + map);
    }
}
