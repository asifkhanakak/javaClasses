package com.class6;

import java.util.Scanner;

public class Task2InClass {

	public static void main(String[] args) {

		boolean sale;

		 double discount, price, finalprice;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.print("Do you have Sale today: ");
		sale = scan.nextBoolean();

		if (sale) {
			System.out.print("What is the price of the item: ");
			price = scan.nextFloat();
			
		     if (price < 20) {
				discount = (price * 0.1);
			} else if (price > 20 && price < 100) {
				discount = (price * 0.2);
			} else if (price > 100 && price < 500) {
				discount = (price * 0.3);
			} else   {
				discount = (price * 0.5);
			}
				finalprice = (price - discount);
			
				System.out.println("After Disocunt " + discount + " the price of the item reduce from " + price + " to "+ finalprice);
			
		}  else {
			System.out.println("There is no sale today");
		}
		
	}}
