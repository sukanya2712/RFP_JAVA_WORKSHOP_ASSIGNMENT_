package com.CollectionandStream.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSett {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();
        // Adding elements to the HashSet
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        // Displaying the elements of the HashSet
        System.out.println("HashSet Elements: " + set);
        System.out.println();

        // Checking if an element exists in the HashSet
        System.out.println("HashSet contains Bob: " + set.contains("Bob"));
        System.out.println();

        // Removing an element from the HashSet
        set.remove("Charlie");
        System.out.println("HashSet after removing Charlie: " + set);
        System.out.println();

        // Clearing all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing all elements: " + set);
        System.out.println();

        // Adding elements to the HashSet
        set.add("David");
        set.add("Emily");
        System.out.println("set after adding elements to it : " +  set);
        System.out.println();

        // Checking if the HashSet is empty
        System.out.println("HashSet is empty: " + set.isEmpty());
        System.out.println();

        // Creating an iterator to iterate over the elements of the HashSet
        System.out.println("Iterating over element");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("HashSet element: " + element);
        }
        System.out.println();


        // Getting the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());
        System.out.println();

        // Converting the HashSet to an array
        Object[] array = set.toArray();
        System.out.println("Array elements: ");
        for (Object element : array) {
            System.out.println(element);
        }
        System.out.println();


        System.out.println("-----------------------------------------------------");
        System.out.println("Processing collection using stream");

        // Using stream to perform operations on HashSet Filter elements
        Set<String> filteredSet = set.stream().filter(element -> element.startsWith("D")).collect(Collectors.toSet());
        System.out.println("Filtered HashSet Elements: " + filteredSet);
        System.out.println();

        // Map elements to new values
        Set<String> mappedSet = set.stream().map(element -> "Name: " + element).collect(Collectors.toSet());
        System.out.println("Mapped HashSet Elements: " + mappedSet);
        System.out.println();

        // Reduce elements
        int sum = set.stream().mapToInt(String::length).sum();
        System.out.println("Sum of lengths of HashSet elements: " + sum);
        System.out.println();


    }
}
