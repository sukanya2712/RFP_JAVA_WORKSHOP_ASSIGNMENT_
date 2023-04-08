package com.StringPermutations;

import java.util.Scanner;

/*WAP TO PRINT PERMUTATION AND COMBINATION OF GIVEN STRING IN ITERATIVE WAY */
public class StringPermutationIterative {


    //method to find factorial to decide upperbound for for-loop of permutation
    public int factorial(int lengthOfString){
        int val = 1;
        for (int i=2;i<=lengthOfString;i++){
            val *= i;
        }
        return val;
    }

    //method to find permutation of given string
    public void permutation(String str){
        int lengthOfString = str.length();
        int f = this.factorial(lengthOfString);

        for (int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for (int div = lengthOfString;div>=1;div--){
                int quotient = temp/div;
                int remainder = temp%div;

                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);

                temp = quotient;
            }
            System.out.println();
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();

        StringPermutationIterative permutationObject = new StringPermutationIterative();
        permutationObject.permutation(str);
    }
}