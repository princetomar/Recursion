package com.company;

import java.util.Scanner;

public class FirstIndexOfNumber
{
    private static int findNumIndeX(int arr[],int index,int x)
    {
        if (index >= arr.length-1)
            return -1;

        if (arr[index] == x)
            return index;

        return findNumIndeX(arr,index+1,x);
    }

    public static int findNumIndex(int arr[],int x)
    {
        return findNumIndeX(arr,0,x);
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
