package com.company;

import java.util.Scanner;

public class LastIndexOfNumber
{
    private static int findNumIndex(int arr[],int index,int x)
    {
        if (index <= 0)
            return -1;

        if (arr[index] == x)
            return index;

        return findNumIndex(arr,index-1,x);
    }

    public static int findNumIndex(int arr[],int x)
    {
        int n = arr.length-1;
        return findNumIndex(arr,n,x);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("enter array elements : ");

        for (int i=0 ; i<n ; i++)
            arr[i] = scan.nextInt();

        System.out.print("enter search element : ");
        int x = scan.nextInt();

        System.out.println("Result : "+ findNumIndex(arr,x));
    }
}
