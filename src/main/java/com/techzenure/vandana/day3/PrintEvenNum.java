/**
 * program to print even numbers in between x and y
 * @author Vandana
 */
package com.techzenure.vandana.day3;

import java.util.Scanner;

public class PrintEvenNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.print("enter the first no:");
        int x=scn.nextInt();
        System.out.print("enter the second no:");
        int y=scn.nextInt();
        if(x>y)
        {
        	System.out.println("invalid input::second number shold be greater than first number");
        }
        else {
        for(int i=x+1;i<y;i++)
        {
        	if(i%2==0)
        		System.out.print(i+" ");
        }
        }
	}

}
