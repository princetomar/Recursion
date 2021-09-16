package com.company;

import java.util.Scanner;

public class SumOfArrays
{
    public static int sum(int arr[],int n)
    {

        if (n == 0)
            return 0;

        return arr[n-1]+ sum(arr,n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++)
            arr[i] = scan.nextInt();

        System.out.println("Sum of elements of array is : "+ sum(arr,n));
    }
}
