package com.CollectionandStream.List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListt {
    public static void main(String[] args) {

        System.out.println("LIST1 OPERATION");
        //Creating Integer arraylist
        ArrayList<Integer> listnumber = new ArrayList<Integer>();       //arraylist1
        listnumber.add(10);
        listnumber.add(20);
        listnumber.add(30);
        listnumber.add(40);
        listnumber.add(50);
        System.out.println(listnumber);

        System.out.println();
        System.out.println("Printing list element using for loop");
        for (Integer number : listnumber) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("ADDING ELEMENT AT INDEX 4");
        listnumber.add(4, 60);
        System.out.println(listnumber);

        System.out.println();
        System.out.println("Getting no from index 3 : ");
        int number = listnumber.get(3);
        System.out.println(number);

        System.out.println("checking if list contains 40");
        System.out.println(number);
        boolean contain = listnumber.contains(40);         //contains
        System.out.println(contain);
        System.out.println();


        //Creating string arraylist
        System.out.println("-------------------------------");
        System.out.println("LIST2 OPERATION");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        System.out.println();
        System.out.println("printing element from list 2 using iterator");
        for (String fruit : fruits) {
            System.out.print(fruit);
        }
        System.out.println();

        //Creating list3
        System.out.println("-------------------------------");
        System.out.println("LIST3 OPERATION");
        ArrayList list3 = new ArrayList();
        list3.add("cat");
        list3.add("bat");
        list3.add("mat");
        System.out.println("Adding list2 to list3");
        list3.addAll(listnumber);
        System.out.println(list3);
        System.out.println();
        System.out.println("-----------------------------------");

        System.out.println("performing operation on fruits using filter in stream such that length of string should be 5");
        fruits.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);
        System.out.println();

        System.out.println("performing operation on stack2 using map in stream such that changing element to uppercase");
        fruits.stream().map(String::toLowerCase).forEach(System.out::println);

        System.out.println("processing vector using stream feature(reduce) : getting sum of objects in vector 3 ");
        int sum = listnumber.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        System.out.println("processing stack1 using stream feature : creating stack that contains only even number ");
        List<Integer> evenNumbers = listnumber.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

    }}