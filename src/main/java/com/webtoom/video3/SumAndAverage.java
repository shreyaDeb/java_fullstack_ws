package com.webtoom.video3;
import java.util.Scanner;

public class SumAndAverage {
    public static void main (String [] args)
    {
        System.out.println("integer num1: ");
        Scanner sc1 = new Scanner(System.in);
        float num1 = sc1.nextFloat();
        System.out.println(" num2: ");
        Scanner sc2 = new Scanner(System.in);
        float num2 = sc2.nextFloat();

        System.out.println("sum: " + (num1+num2));
        System.out.println("average: " + ((num1+num2)/2));

    }
}
