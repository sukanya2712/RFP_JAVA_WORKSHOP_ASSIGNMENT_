package com.CollectionandStream.Set;

import java.util.TreeSet;

public class Treesett {
    public static void main(String[] args) {

        // Create a new TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);
        System.out.println();

        // Check if the TreeSet contains an element
        System.out.println("Contains 15? " + treeSet.contains(15));
        System.out.println();

        // Remove an element from the TreeSet
        treeSet.remove(5);
        System.out.println("removing element 5 from treeset : " + treeSet);

        // Get the first element in the TreeSet
        System.out.println("First element: " + treeSet.first());
        System.out.println();

        // Get the last element in the TreeSet
        System.out.println("Last element: " + treeSet.last());
        System.out.println();

        // Check if the TreeSet is empty
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());
        System.out.println();

        // Get the size of the TreeSet
        System.out.println("Size of the TreeSet: " + treeSet.size());
        System.out.println();

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
        System.out.println();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        System.out.println("adding new element to list" + treeSet);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Stream operation");

        // Stream operations on the TreeSet
        System.out.print("TreeSet in ascending order using stream: ");
        treeSet.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("TreeSet in descending order using stream: ");
        treeSet.descendingSet().stream().forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
