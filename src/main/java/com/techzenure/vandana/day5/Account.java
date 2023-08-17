/**
 * program to create the account and calculate details.
 * @author Vandana
 */
package com.techzenure.vandana.day5;

public class Account 
{
	private long accno;
	private String name;
	private float balance;
	public Account(long accno, String name, float balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
  
	public float getBalance() {
		return balance;
	}

	public void deposit(float amt)
    {
    	this.balance+=amt;
    	System.out.println("Rs. "+amt+" credited | Balance: "+this.balance);
    }
    public void withdraw(float amt)
    {
    	if(this.balance>=amt)
    	{
    		this.balance=this.balance-amt;
    		System.out.println("Rs. "+amt+" debited | Balance: "+this.balance);
    	}
    	else
    	{
    		System.out.println("ERROR:INSUFFICIENT BALANCE");
    	}
    }
    public void getBal()
    {
    	System.out.println("A/C No: "+this.accno+" | Name: "+this.name+" | BALANCE: "+this.balance);
    }
}
