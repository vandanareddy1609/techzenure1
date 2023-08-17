/**
 * program to perform Arithmatic Operators
 * @author Vandana
 */
package com.techzenure.vandana.day1;

import java.util.Scanner;

public class ArithmaticOperators {
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(-10%-3);
		System.out.println(9.0f%3.0);
//		System.out.println(a/0);  java.lang.ArithmeticException
		System.out.println(9.0/0);
		System.out.println(-9.0f/0);
	}

}
