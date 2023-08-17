/**
 * program to print student details using constructor
 * @author Vandana
 */
package com.techzenure.vandana.day5;

import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
        Student student;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Student's id: ");
		int id=scn.nextInt();
		System.out.print("Enter Student's name:\n ");
		String name=scn.next();
		System.out.print("Enter Student's address: ");
        String address =scn.next();
        System.out.print("Whether the student is from NIT(Yes/No): ");
        String opt=scn.next();
        while(true)
        {
        if(opt.equals("YES")||opt.equals("yes"))
        {
           student=new Student(id,name,address);
           break;
        }
        else if(opt.equals("NO")||opt.equals("no"))
        {
        	System.out.print("Enter the College name: ");
        	String clg=scn.nextLine();
        	student=new Student(id,name,address,clg); 
        	break;
        	
        }
        else
        {
        	System.out.println("Wrong input");
            System.out.print("Whether the student is from NIT(Yes/No): ");
            opt=scn.next();
        }
        }
        System.out.println("Student id: "+student.getStudentId());
        System.out.println("Student name: "+student.getStudentName());
        System.out.println("Address: "+student.getStudentAddress());

		System.out.println("College Name: "+student.getCollegeName());
	}
}
