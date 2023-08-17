/**
 * To check the Account class by using Main Method
 * @author Vandana
 */
package com.techzenure.vandana.day5;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Account acc = null;

		System.out.println("1.create Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Details");
		System.out.println("5.Interest Calculation");
		System.out.println("6.Service Charge");
		System.out.println("7.exit");
		while(true)
		{
			
			System.out.print("enter the option: ");
			int opt=scn.nextInt();
			switch(opt)
			{
			case 1:
				if(acc==null)
				{
					System.out.print("enter the type of a/c[1.Savings | 2.Current]: ");
					int accType=scn.nextInt();
					
					System.out.print("enter a/c no : ");
					long acno=scn.nextLong();
					
					System.out.print("enter name: ");
					String name=scn.next();
					
					System.out.print("enter initial deposit: ");
					float amt=scn.nextFloat();
					
					if(accType==1)
					{
						System.out.print("enter rate of interest: ");
						float roi=scn.nextFloat();
						acc=new SavingsAccount(acno,name,amt,roi); 
					}
					else {
						acc=new CurrentAccount(acno,name,amt);
					}
					System.out.println("ACCOUNT OPENED");
				}
				break;
			case 2:
				if(acc!=null)
				{
					System.out.print("enter amount to deposit: ");
					float amt=scn.nextFloat();
					acc.deposit(amt);
				}else {
					System.err.println("PLEASE OPEN AN A/C WITH US");
				}
				break;
			case 3:
				if(acc!=null)
				{
					System.out.print("enter amount to withdraw: ");
					float amt=scn.nextFloat();
					acc.withdraw(amt);
				}else {
					System.err.println("PLEASE OPEN AN A/C WITH US");
				}
				break;
			case 4:
				if(acc!=null)
				{
					acc.getBal();
				}else {
					System.err.println("PLEASE OPEN AN A/C WITH US");
				}
				break;
			case 5:
				if(acc instanceof SavingsAccount)
				{
					((SavingsAccount)acc).calculateInterest();
				}else {
					System.out.println("THIS A/C WILL NOT BE HAVING THIS SERVICE");
				}
				break;
			case 6:
				if(acc instanceof CurrentAccount)
				{
					((CurrentAccount)acc).serviceCharge();
				}else {
					System.out.println("NO SERVICE CHARGES FOR THIS TYPE OF ACCOUNT");
				}
				break;
			case 7:
				System.out.println("application designed & developed by VANDANA");
				System.exit(0);
				break;
			default:
				System.out.println(".....INVALID OPERATION..PLEASE TRY AGAIN..");
			}
			System.out.println("-------------------------");
		}

	}

}
