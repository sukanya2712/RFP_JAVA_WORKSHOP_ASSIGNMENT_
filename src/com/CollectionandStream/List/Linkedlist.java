package com.CollectionandStream.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        System.out.println("list1 operation");
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);

        LinkedList<String> list2 = new LinkedList<>();
        System.out.println("----------------------------");
        System.out.println("list2 operation");
        list2.add("MANGO");
        list2.add("APPLE");
        list2.add("ORANGE");
        list2.add("PEARS");
        list2.add("BANANA");
        System.out.println(list2);



        LinkedList list3 = new LinkedList<>();
        System.out.println("----------------------------");
        System.out.println("list3 operation");
        list3.add("fruit");
        list3.add("numbers");
        list3.add("baskets");
        System.out.println("Adding list2 to list3");
        list3.addAll(list2);                    //adding list1 to list3
        System.out.println(list3);
        System.out.println();

        System.out.println("Iterating over the element in the list3 using Iterator :  ");
        Iterator<String> itr=list3.iterator();    //using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();


        System.out.println("adding Element start at the beginning of list");
        list3.addFirst("start");              //adding element at the start
        System.out.println(list3);
        System.out.println();


        System.out.println("adding Element end at the ending of list");
        list3.addLast("end");                 //adding element at the last
        System.out.println(list3);
        System.out.println();

        System.out.println(list3);
        String peeked = (String) list3.peek();
        System.out.println("The peek element will be : " + peeked);
        System.out.println();

        System.out.println(list3);
        String popped = (String) list3.poll();
        System.out.println("The element will be popped: " + popped);
        System.out.println();


        System.out.println("The first Element will be removed : ");
        list3.removeFirst();
        System.out.println(list3);
        System.out.println();

        System.out.println("The last element will be removed : ");
        list3.removeLast();
        System.out.println(list3);
        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("performing operation on list2 using filter in stream api such that length of string should be 5");
        list2.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);
        System.out.println();

        System.out.println("performing operation on list2 using map in stream such that changing each string to to uppercase");
        list2.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println();

        System.out.println("processing list1 using stream feature : creating list that contains only even number ");
        List<Integer> evenNumbers = list1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

    }


}
