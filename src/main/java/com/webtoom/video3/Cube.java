package com.webtoom.video3;

import java.util.Scanner;

public class Cube {
    public static void main(String [] args)
    {
        System.out.println("number to be cubed: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("cube of the number " + num + ": " + Math.pow(num, 3));
    }
}
