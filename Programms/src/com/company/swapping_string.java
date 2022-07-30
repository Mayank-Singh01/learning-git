package com.company;
import java.util.Scanner;
public class swapping_string {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int a = x.length();
        String rev = "" ;
        for (int i = a - 1 ;i>=0  ; i--)
        {
            rev = rev + x.charAt(i);
        }
        System.out.println(rev);

    }

}
