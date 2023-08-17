/**
 * program to find the sum of digits of a number
 * @author Vandana
 */
package com.techzenure.vandana.day3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=scn.nextInt();
        int num=n;
        int sum=0;
        while(n>0)
        {
        	int d=n%10;
        	sum+=d;
        	n/=10;
        }
        System.out.println("Sum of digits of "+num+" = "+sum);
	}

}
