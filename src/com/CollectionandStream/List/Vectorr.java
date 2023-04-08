package com.CollectionandStream.List;

import java.util.Iterator;

import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        System.out.println("Vector operation");
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);
        vector1.add(50);
        System.out.println(vector1);

        Vector<String> vector2 = new Vector<>();
        System.out.println("----------------------------");
        System.out.println("vector2 operation");
        vector2.add("MANGO");
        vector2.add("APPLE");
        vector2.add("ORANGE");
        vector2.add("PEARS");
        vector2.add("BANANA");
        System.out.println(vector2);



        Vector vector3 = new Vector();
        System.out.println("----------------------------");
        System.out.println("vector3 operation");
        vector3.add("fruit");
        vector3.add("numbers");
        vector3.add("baskets");
        vector3.addAll(vector2);   //adding Vector to vector3

        System.out.println("Iterating over the element in the vector3 using Iterator :  ");
        Iterator<String> itr=vector3.iterator();    //using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        String element = (String) vector3.firstElement();
        System.out.println(" getting first element of list" + element);

        String element2 = (String) vector3.lastElement();
        System.out.println(" getting last element of list" + element2);

        System.out.println("The vector3 will be : ");
        System.out.println(vector3);

        System.out.println("The Element numbers will be removed : ");
        vector3.remove("numbers");
        System.out.println(vector3);

        System.out.println("--------------------------------------------------------");
        System.out.println("performing operation on vector2 using filter in stream such that length of string should be 5");
        vector2.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);
        System.out.println();

        System.out.println("performing operation on vector2 using map in stream such that changing each object to uppercase");
        vector2.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("processing vector using stream feature(reduce) : getting sum of objects in vector 3 ");
        int sum = vector1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
