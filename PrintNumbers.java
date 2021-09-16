package com.company;

import java.util.Scanner;

public class PrintNumbers
{
    public static void numbers(int n)
    {
       if (n == 1) {
           System.out.print(n + " ");
           return;
       }
       numbers(n-1);
       System.out.print(n+" ");
    }

    public static int printNumbers(int l,int n)
    {
        if (l > n)
        {
            return -1;
        }
        else {
            System.out.print(l + " ");
            return printNumbers(l + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = scanner.nextInt();
       numbers(n);

        System.out.println();
       // Using second function
        System.out.println("using printNumbers : ");
        int a = printNumbers(1,n);

    }
}
