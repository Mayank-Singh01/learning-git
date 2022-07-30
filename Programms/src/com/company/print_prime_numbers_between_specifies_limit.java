package com.company;
import java.util.Scanner;
public class print_prime_numbers_between_specifies_limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int num = sc.nextInt();
        int cond = 0;
        for (int i = 1; i<=num;i++)
        {
            for (int j =2 ;j<=i-1 ; j++)
            {
                if (i%j == 0)
                {
                    cond = cond + 1 ;
                }
            }
            if (cond == 0)
            {
                System.out.println(i);

            }else{
                cond = 0;
            }
        }
    }
}
