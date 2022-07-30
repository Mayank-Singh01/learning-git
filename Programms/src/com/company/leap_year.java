package com.company;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year YEAR :- ");
        int x = sc.nextInt();
//        if (x%4==0)
//        {
//            if (x%100==0)
//            {
//                if (x%400==0)
//                {
//                    System.out.println("LY");
//                } else
//                {
//                    System.out.println("NLY");
//                }
//            }else
//            {
//                System.out.println("LY");
//            }
//        }else
//        {
//            System.out.println("NLY");
//        }

        //Method 2
        if ((x%400==0) || (x%4==0 && x%100!=0 ))
        {
            System.out.println("LY");
        }
        else
        {
            System.out.println("NLY");
        }
    }
}
