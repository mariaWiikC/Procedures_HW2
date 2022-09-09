package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(sumUpTo(20));
    }

    static int sumUpTo (int n)
    {
        int sum = n * (n + 1) / 2;
        return sum;
    }
}
