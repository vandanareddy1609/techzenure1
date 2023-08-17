/**
 * program to perform operations on Datatypes
 * @author Vandana
 */
package com.techzenure.vandana.day1;

public class DataTypes {

   public static void main(String[] args) {
		byte b=10;            //Integer datatypes
		short a=10;
		byte c=(byte) (a+b);
		int d=a+b;
		System.out.println(c);
		System.out.println(d);
        long l=50l;
        int f=(int) (l+d);
	    System.out.println(f);
	    System.out.println();
	  //character datatype  
	    char ch='C';
        System.out.println(ch);
        ch=67;
        System.out.println(ch);
        ch='\u0041';           //unicode type
        System.out.println(ch);
        ch='\u0c05';
        System.out.println(ch);
        System.out.println();
       //real type
        float u=10.0f;
		System.out.println(u);
        double f2=10.0;
        System.out.println(f2);
        float f1=(float) (u+f2);
        System.out.println(f1);   
		}
}
