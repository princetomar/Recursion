package com.company;

import java.util.Scanner;

public class All_IndexofNumber
{
    private static int[] AllNumIndex(int arr[],int index,int x)
    {
        if (index == arr.length) {
            int [] output = new int[0];
            return output;
        }

        int [] smallOutput = AllNumIndex(arr,index+1,x);
        if (arr[index] == x)
        {
            int output[] = new int[smallOutput.length+1];
            output[0] = index;
            for (int i=0 ; i< smallOutput.length ; i++)
            {
                output[i+1] = smallOutput[i];
            }
            return output;
        }
        else
        {
            return smallOutput;
        }
    }

    public static int[] AllNumIndex(int arr[],int x)
    {
        int n = 0;
        return AllNumIndex(arr,n,x);
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

        int ans[] = AllNumIndex(arr,x);
        for (int i=0 ;i< ans.length ; i++)
            System.out.print(ans[i]+" ");
    }
}
