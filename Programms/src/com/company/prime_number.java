package com.company;
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number : ");
        int x = sc.nextInt();
        int y = 0 ;
        for (int i = 2 ; i<=x-1;i++) {
            if (x % i == 0)
            {
                y = y +1 ;
            }
        }
        if (y > 0){
            System.out.println("Not a prime number");
        }else {
            System.out.println("the given number is prime");
        }

    }

}
