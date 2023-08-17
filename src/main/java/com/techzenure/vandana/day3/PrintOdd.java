/**
 * program to print first n odd numbers
 * @author Vandana
 */
package com.techzenure.vandana.day3;

import java.util.Scanner;

public class PrintOdd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter how many odd numbers to be generated:");
		int num=scn.nextInt();
		int count=0;
		for(int i=1;;i++)
		{
			if(count==num) break;
			if(i%2!=0) {
				count++;
				System.out.print(i+" ");
			}
		}
	}
}
