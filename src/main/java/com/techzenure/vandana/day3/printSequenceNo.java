/**
 * program to print numbers in sequence order
 * @author Vandana
 */
package com.techzenure.vandana.day3;

import java.util.Scanner;

public class printSequenceNo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter range:");
		int n=scn.nextInt();
		int i=1;
		int count=0;
		while(i>0)
		{
			System.out.print(i+"  ");
			i=i+3;
			count++;
			if(count==n) break;
		}
	}
}
