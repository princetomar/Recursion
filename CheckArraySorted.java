package com.company;

import java.util.Scanner;

public class CheckArraySorted
{
    public static boolean checkSorted(int arr[], int index)
    {
        // If we have reached upto the end of array and not it's in sorted order
        if(index >= arr.length-1)
            return true;

        if (arr[index] >= arr[index+1])
            return false;

        return checkSorted(arr,index+1);
    }

    public static boolean checkSorted(int arr [])
    {
        return checkSorted(arr,0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("enter array elements : ");

        for (int i=0 ; i<n ; i++)
            arr[i] = scan.nextInt();

        System.out.println("Result : "+ checkSorted(arr));
    }
}
