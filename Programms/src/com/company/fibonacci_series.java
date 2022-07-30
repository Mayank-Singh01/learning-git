package com.company;

public class fibonacci_series {
    public static void main(String[] args) {
        System.out.println("Fibonacci series for ten terms:" );
        int a = 0 ;
        int b = 1 ;
        int c ;
        for (int i = 1 ; i<=10 ; i++)
        {
            c= a+b;
            System.out.print(c);
            System.out.print("\t");
            a = b ;
            b = c ;
        }
        System.out.println("_____" + " and so on");
    }
}
