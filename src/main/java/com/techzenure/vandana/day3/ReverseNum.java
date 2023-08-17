/**
 * program to find the reverse number of given number
 * @author Vandana
 */
package com.techzenure.vandana.day3;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=scn.nextInt();
        int num=n;
        int rev=0;
        while(n>0)
        {
        	int d=n%10;
        	rev=rev*10+d;
        	n/=10;
        }
        System.out.println("reverse of "+num+" = "+rev);

	}

}
