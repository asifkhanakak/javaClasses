package com.class7;

import java.util.Scanner;

public abstract class Task2 {

	public static void main(String[] args) {
	
		/*Ask user to pay for coffee
		 * keep asking user to pay for it until
		 * enterd price is equal =5
		 * After user paid then say"Enjoy your coffee!"
		 */
		int price;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please pay for your coffee ");
		price=scan.nextInt();
		while ( price<5) {
			System.out.println("Please pay for your coffee");
			 price=scan.nextInt();
						
		}
		
		System.out.println("Enjoy your coffee");
	}

}
