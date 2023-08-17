/**
 * To perform Inheritance with the Account class
 * @author Vandana
 */
package com.techzenure.vandana.day5;

public class CurrentAccount extends Account {
    public CurrentAccount(long accno, String name, float balance) {
		super(accno, name, balance);
	}
	int freeTrans=3;
    int transactionsCount=0;
    int transRate=100;
	@Override
	public void deposit(float amt) {

		transactionsCount++;
		super.deposit(amt);
	}
	@Override
	public void withdraw(float amt) {

		transactionsCount++;
		super.withdraw(amt);
	}
	@Override
	public void getBal() {
		transactionsCount++;
		super.getBal();
	}
    public void serviceCharge()
    {
    	int serviceChargeCounts=transactionsCount-freeTrans;
    	if(serviceChargeCounts>0)
    	{
    		transactionsCount=0;
    		float amount=serviceChargeCounts*transRate;
    		super.withdraw(amount);
    	}
    	else {
    		System.out.println("NO SERVICE CHARGE AT THIS TIME");
    	}
    }
    
}
