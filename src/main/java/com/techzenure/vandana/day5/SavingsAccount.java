/**
 * To perform Inheritance with the Account class
 * @author Vandana
 */
package com.techzenure.vandana.day5;

public class SavingsAccount extends Account{
    
	float roi;
	public SavingsAccount(long accno, String name, float balance,float roi) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
		this.roi=roi;
	}
    public void calculateInterest()
    {
    	float intrst=roi * this.getBalance()/100;
    	super.deposit(intrst);
    }
}
