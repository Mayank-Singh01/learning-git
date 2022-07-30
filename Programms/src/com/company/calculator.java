package com.company;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number a = ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number b = ");
        int b = sc.nextInt();
        System.out.println("Enter the operation to perform (+,-,*,/) ");
        String sym = sc.next();
        int res ;
        switch (sym)
        {
            case "+" : res = a + b;
            System.out.println(res);
            break ;
            case "-" : res = a - b ;
                System.out.println(res);
                break ;
            case "*" : res = a * b ;
                System.out.println(res);
                break ;
            case "/" : res = a / b ;
                System.out.println(res);
                break ;
            default : System.out.println("Invalid Operation");
            break ;
        }
    }
}
