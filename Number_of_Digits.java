package com.company;

public class Number_of_Digits
{

    public static int numDigit(int n){
        int cnt = 0;
        if (n <9)
            return 1;

        n /= 10;
        cnt++;

        numDigit(n);

        return cnt;

    }

    public static void main(String[] args) {
        System.out.println(numDigit(123));
    }
}
