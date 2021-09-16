package com.company;

import java.util.Scanner;

public class Fibonnacci
{
    public static int fib(int n)
    {
        if (n==0 || n==1)
            return 1;

        return fib(n-1)+fib(n-2);
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n : ");
        int n= scan.nextInt();

        System.out.println(fib(n));
    }
}
