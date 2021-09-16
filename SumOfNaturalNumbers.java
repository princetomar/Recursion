package com.company;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
    public static int sum(int n)
    {
        if (n == 1)
            return 1;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("sum of "+n+" numbers : "+sum(n));
    }
}
