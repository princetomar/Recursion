package com.company;

import java.util.Scanner;

public class factorial
{
    public static int fact(int n)
    {
        if(n == 0)
            return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number to find it's com.company.factorial : ");
        int n = scan.nextInt();
        System.out.println("Factorial result : "+fact(n));
    }
}
