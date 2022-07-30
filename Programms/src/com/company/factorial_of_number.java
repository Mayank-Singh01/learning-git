package com.company;
import java.util.Scanner;
public class factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int fact = 1;
//        for (int i = 1 ;i<=N ; i++)// USING INCREMENT
//        {
//            fact = fact * i ;
//
//        }
//        System.out.println(fact);
        //USING DECREMENT
        for (int i = N ; i >= 1 ; i--)
        {
            fact = fact * i ;
        }
        System.out.println(fact);
    }
}
