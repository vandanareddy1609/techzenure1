/**
 * program to print the given number in word
 * @author Vandana
 */
package com.techzenure.vandana.day3;

import java.util.Scanner;

public class DisplayNumberInWords {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=scn.nextInt();
		int d;
		String num="";
		while(n>0)
		{
			d=n%10;
			num=num+d;
			n/=10;
		}
		char c;
		for(int i=num.length()-1;i>=0;i--)
		{
			c=num.charAt(i);
			switch(c)
			{
			case '0':System.out.print("ZERO "); break;
			case '1':System.out.print("ONE "); break;
			case '2':System.out.print("TWO "); break;
			case '3':System.out.print("THREE "); break;
			case '4':System.out.print("FOUR "); break;
			case '5':System.out.print("FIVE "); break;
			case '6':System.out.print("SIX "); break;
			case '7':System.out.print("SEVEN "); break;
			case '8':System.out.print("EIGHT "); break;
			case '9':System.out.print("NINE "); break;
			}
		}
	}
}
