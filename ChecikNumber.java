package com.company;

import java.util.Scanner;

public class ChecikNumber
{
    public static boolean checknumber(int arr[],int n ,int x)
    {
        if(n==0)
            return false;

        if(arr[n-1] == x)
            return true;

        return checknumber(arr,n-1,x);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        int x = scan.nextInt();
        System.out.println("Result : "+checknumber(arr,n,10));
    }
}
