package com.webtoom.video3;

import java.util.Scanner;

public class SwappingValues {
    public static void main (String [] args)
    {
        System.out.println(" choose x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(" choose y: ");
        int y = sc.nextInt();

        int z = x; // z is a temporary int variable which has been assigned the value of x
        x = y;     // now x is being updated to be the value of y
        y = z;     // now y is being updated to be the temparory value of z which it got from the original value of x
        System.out.println("now x is: " + x + " and y is: " + y);
    }
}
