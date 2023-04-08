package com.CollectionandStream.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class LinkedHashSett {
    public static void main(String[] args) {

        // Create a new LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");

        // Print the set
        System.out.println("Initial set: " + set);
        System.out.println();

        // Check if the set contains an element
        System.out.println("Set contains banana? " + set.contains("banana"));
        System.out.println();

        // Get the size of the set
        System.out.println("Size of the set: " + set.size());
        System.out.println();

        // Convert the set to an array
        String[] arr = set.toArray(new String[set.size()]);
        System.out.println("Set as array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Remove an element from the set
        set.remove("date");
        System.out.println("Set after removing date: " + set);
        System.out.println();

        // Clear the set
        set.clear();
        System.out.println("Set after clearing: " + set);
        System.out.println();

        // Add new elements to the set
        System.out.println("adding new element to set");
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");
        System.out.println(set);
        System.out.println();

        // Iterate over the set and print its elements
        Iterator<String> it = set.iterator();
        System.out.print("Set elements using iterator: ");
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + " ");
        }
        System.out.println();

        // Check if the set is empty
        System.out.println("Is the set empty? " + set.isEmpty());
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Stream operations ");
        System.out.println();

        // Use stream to filter and collect elements into a new set
        LinkedHashSet<String> newSet = set.stream().filter(str -> str.length() > 5).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("New set with elements longer than 5 characters: " + newSet);
        System.out.println();

        LinkedHashSet<String> newSet2 = set.stream().filter(str -> str.contains("e")).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("New set with elements containing \"e\": " + newSet2);
        System.out.println();

        System.out.println("Elements starting with \"a\":");
        set.stream().filter(str -> str.startsWith("a")).forEach(System.out::println);
    }
}
