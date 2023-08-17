/**
 * program to generate bill based on items
 * @author Vandana
 */

package com.techzenure.vandana.day1;

import java.util.Scanner;

public class BillGeneration {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter the no of pizzas bought: ");
		int a=scn.nextInt();
		System.out.print("enter the no of puffs bought: ");
		int b=scn.nextInt();
		System.out.print("enter the no of cool drinks bought: ");
		int c=scn.nextInt();
		int pizzasCost=a*100;
		int puffsCost=b*20;
		int coolDrinksCost=c*10;
		float totalCost=pizzasCost+puffsCost+coolDrinksCost;
		System.out.println();
		System.out.printf("No of Pizzas       :%d\t cost:%d\n",a,pizzasCost);
		System.out.printf("No of Puffs        :%d\t cost:%d\n",b,puffsCost);
		System.out.printf("No of Cool Drinks  :%d\t cost:%d\n",c,coolDrinksCost);
		System.out.println();
		System.out.printf("Total price=%.2f\n",totalCost);
		System.out.println("ENJOY THE SHOW!!!");		
	}
}
