package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class larger_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a = ");
        int a = sc.nextInt();
        System.out.print("Enter second number b = ");
        int b = sc.nextInt();
        System.out.print("Enter third number c = ");
        int c = sc.nextInt();
        //ladder method
//        if (a>b && a>c)
//        {
//            System.out.println("First is largest...!");
//        }else if (b>c)
//        {
//            System.out.println("Second number is largest...!");
//        }else
//        {
//            System.out.println("Third number is largest...!");
//        }
        if (a>b)
        {
            if (a > c)
            {
                System.out.println("First is largest...!");
            }
            else
            {
                System.out.println("Third number is largest...!");
            }
        }
            else if (b>c)
            {
                System.out.println("Second number is largest...!");
            }
            else
            {
            System.out.println("Third number is largest...!");
            }
    }
}

