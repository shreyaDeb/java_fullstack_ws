package com.webtoom.video3;

import java.util.Scanner;

public class NetAverageWeight {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of person 1: ");
        float w1 = sc.nextFloat();

        System.out.println("Enter the weight of person 2: ");
        float w2 = sc.nextFloat();

        System.out.println("Enter the weight of person 3: ");
        float w3 = sc.nextFloat();

        System.out.println("Enter the weight of person 4: ");
        float w4 = sc.nextFloat();

        System.out.println("Enter the weight of person 5: ");
        float w5 = sc.nextFloat();

        System.out.println("The net weight of the 5 people are: " + (w1+w2+w3+w4+w5));
        System.out.println("The average weight of the 5 people are: " + ((w1+w2+w3+w4+w5)/5));
    }
}
