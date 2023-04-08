package com.CollectionandStream.List;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Stackk {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<Integer>();
        System.out.println("stack1 operation");
        stack1.add(10);
        stack1.add(20);
        stack1.add(30);
        stack1.add(40);
        stack1.add(50);
        System.out.println(stack1);

        Stack<String> stack2 = new Stack<>();
        System.out.println("----------------------------");
        System.out.println("stack2 operation");
        stack2.add("MANGO");
        stack2.add("APPLE");
        stack2.add("ORANGE");
        stack2.add("PEARS");
        stack2.add("BANANA");
        System.out.println(stack2);



        Stack stack3 = new Stack();
        System.out.println("----------------------------");
        System.out.println("stack3 operation");
        stack3.add("fruit");
        stack3.add("numbers");
        stack3.add("baskets");
        stack3.addAll(stack2);                    //adding stack1 to stack3
        System.out.println();

        System.out.println("Iterating over the element in the stack3 using Iterator :  ");
        Iterator<String> itr=stack3.iterator();    //using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println(stack3);
        String element = (String) stack3.firstElement();
        System.out.println("The first element of stack3 : " + element);

        String element2 = (String) stack3.lastElement();
        System.out.println("The last element of stack3 : " + element2);

        String peeked = (String) stack3.peek();
        System.out.println("The peek element is : " + peeked);

        String popped = (String) stack3.pop();
        System.out.println("The element will be popped: " + popped);
        System.out.println();

        System.out.println("The element numbers removed from stack3 : ");
        stack3.remove("numbers");
        System.out.println(stack3);

        System.out.println("--------------------------------------------------------");
        System.out.println("processing stack2 using stream feature(filter) : printing strings whose length is less than five");
        stack2.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);
        System.out.println();

        System.out.println("processing stack2 using stream feature(map) : converting each string in stack to uppercase ");
        stack2.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println();

        System.out.println("processing stack1 using stream feature : creating stack that contains only even number ");
        List<Integer> evenNumbers = stack1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println();

        System.out.println("processing stack1 using stream feature : creating stack that contains only even number ");
        List<Integer> squares = stack1.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squares);
    }

}

