/**
 * program to print total and average of student marks 
 * @author Vandana
 */
package com.techzenure.vandana.day4;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarks {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\tREPORT CARD");
		System.out.print("enter student name: ");
		String studentName=scn.nextLine();
		System.out.print("enter number of subjects: ");
		int num=scn.nextInt();
		System.out.println();
		int[] marks=new int[num];
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("enter mark for subject-"+(i+1)+":");
			marks[i]=scn.nextInt();
		}
		System.out.println();
//		System.out.print("marks entered: "+Arrays.toString(marks)+"\n");
		System.out.print("Student Name: "+studentName.toUpperCase()+"\n");
		System.out.println();
		System.out.println("SUBJECT\t\tMARK");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("subject-"+(i+1)+"\t"+marks[i]);
		}
		System.out.println();
		int totalmarks = 0;
		for(int i=0;i<marks.length;i++)
		{
			totalmarks+=marks[i];
		}
		float average=totalmarks/marks.length;
		
		System.out.println("TOTAL: "+totalmarks+"\tAVERAGE:"+average);
	}

}
