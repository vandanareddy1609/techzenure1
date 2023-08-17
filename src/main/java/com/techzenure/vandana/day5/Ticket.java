/**
 * program to calculate the ticket price 
 * @author Vandana
 */
package com.techzenure.vandana.day5;

public class Ticket 
{
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public  int getAvailableTickets() {
		return availableTickets;
	}
	
	public void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
		   this.availableTickets=availableTickets;
		}
		throw new IllegalArgumentException("exception message");
		
	}
	public int calculateTicketCost(int nooftickets)
	{
		if(nooftickets<availableTickets)
		{
			availableTickets=availableTickets-nooftickets;
			int totalamount=nooftickets*price;
			return totalamount;
		}
		return -1;		
	}
	
}
