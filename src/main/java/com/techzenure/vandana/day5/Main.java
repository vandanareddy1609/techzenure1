/**
 * program to calculate the ticket price 
 * @author Vandana
 */
package com.techzenure.vandana.day5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ticket ticket=new Ticket();
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter no of bookings:");
		int booking =scn.nextInt();
		System.out.println();
		System.out.print("Enter Available Tickets:");
		ticket.setAvailableTickets(scn.nextInt());
		int availableTickets=ticket.getAvailableTickets();
		for(int i=1;i<=booking;i++)
		{
		
        System.out.print("Enter the ticketid:");
        ticket.setAvailableTickets(scn.nextInt());
        int ticketid=ticket.getTicketid();
        System.out.print("Enter the price:");
        ticket.setPrice(scn.nextInt());
        int price=ticket.getPrice();
        System.out.print("Enter the no of tickets: ");
        int numtickets=scn.nextInt();
        System.out.println();
        System.out.println("Available Tickets: "+availableTickets);
        System.out.println("Total Amount: "+ticket.calculateTicketCost(numtickets));
        availableTickets=availableTickets-numtickets;
        System.out.println("Available Tickets after booking: "+availableTickets);
        System.out.println();
		}
	}

}
