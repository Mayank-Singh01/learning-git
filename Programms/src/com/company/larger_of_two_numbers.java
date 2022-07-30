package com.company;
import java.util.Scanner;
public class larger_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        if (a>b)
        {
            System.out.println("First number is Largest...!");
        }
        else {
            System.out.println("Second number is Largest...!");
        }
    }
}
