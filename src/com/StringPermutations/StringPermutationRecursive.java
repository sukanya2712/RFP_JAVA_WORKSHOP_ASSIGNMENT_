package com.StringPermutations;

import java.util.Scanner;

/*WAP TO PRINT PERMUTATION AND COMBINATION OF GIVEN STRING IN RECURSIVE WAY */
public class StringPermutationRecursive {

    String swap(String s, int a, int b){
        char ch[]=s.toCharArray();
        char p=ch[a];
        ch[a]=ch[b];
        ch[b]=p;
        return String.valueOf(ch);
    }
   void permutation(int index, String inputString) {
        if(index == inputString.length() -1){
            System.out.println(inputString);
            return;
        }

        for(int i = index;i<inputString.length();i++){
            inputString=this.swap(inputString,i,index);
            permutation(index+1,inputString);
            inputString=this.swap(inputString,i,index);
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");        //  ABC          BAC          CBA
        String inputString = sc.next();                 //ABC    ACB     BAC  BCA    CBA   CAB

        StringPermutationRecursive permutationObject = new StringPermutationRecursive();
        permutationObject.permutation(0,inputString);
    }

}
