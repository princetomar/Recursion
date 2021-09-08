package com.company;

import java.util.Scanner;

public class PowerOfaNumber
{

    public static int power(int a,int b)
    {
        if(a == 0)
            return 0;
        if (b == 0)
            return 1;

        return a*power(a,b-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = scan.nextInt();
        System.out.print("enter power : ");
        int b = scan.nextInt();

        System.out.println("Result : "+power(a,b));
    }
}
