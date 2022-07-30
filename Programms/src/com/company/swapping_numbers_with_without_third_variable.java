package com.company;
import java.util.Scanner;
public class swapping_numbers_with_without_third_variable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        //without third variable
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        //with third variable
//        System.out.print("a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();
//        int x ;
//        x = a ;
//        a = b ;
//        b = x ;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
    }
}
