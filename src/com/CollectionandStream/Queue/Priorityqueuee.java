package com.CollectionandStream.Queue;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Priorityqueuee {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to PriorityQueue
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.offer(1);

        // Printing the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println();

        // Retrieving the head of PriorityQueue using peek() and element()
        System.out.println("Head of PriorityQueue (peek): " + priorityQueue.peek());
        System.out.println();

        System.out.println("Head of PriorityQueue (element): " + priorityQueue.element());
        System.out.println();

        // Removing and retrieving elements from PriorityQueue using remove() and poll()
        System.out.println("Removing head of PriorityQueue (remove): " + priorityQueue.remove());
        System.out.println("PriorityQueue after removal: " + priorityQueue);
        System.out.println();

        System.out.println("Removing head of PriorityQueue (poll): " + priorityQueue.poll());
        System.out.println("PriorityQueue after removal: " + priorityQueue);
        System.out.println();


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("performing stream operations on priorityqueues");
        System.out.println();

        // Stream operations on PriorityQueue
        PriorityQueue<Integer> streamQueue = new PriorityQueue<>();
        streamQueue.add(5);
        streamQueue.add(1);
        streamQueue.add(4);
        streamQueue.add(2);
        streamQueue.add(3);
        System.out.println(streamQueue);
        System.out.println();

        // Using stream() to filter and collect elements from PriorityQueue
        System.out.println("Elements greater than 2 using stream(): " + streamQueue.stream().filter(e -> e > 2).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Transforming elements in PriorityQueue using map(): " + streamQueue.stream().map(e -> e * 2).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Elements greater than 2 using stream(): " + streamQueue.stream().filter(e -> e > 2).collect(Collectors.toList()));
        System.out.println();
    }
}
