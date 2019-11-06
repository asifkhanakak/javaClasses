package com.class9;

import java.util.Scanner;

public class NestedLoopTask3 {

	public static void main(String[] argany) {

		int sumeven = 0;
		int sumodd = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a starting number: ");
		int a = scan.nextInt();
		System.out.print("Please enter a ending number: ");
		int b = scan.nextInt();

		if (a < b) {

			for (int i = a; i <= b; i++) {

				if (i % 2 == 0) {
					sumeven = sumeven + i;
				}
				if (i % 2 == 1) {

					sumodd = sumodd + i;
				}
			}
				System.out.println("The sum of all even numbers from " + a + " to " + b + " is " + sumeven);
				System.out.println("The sum of all odd numbers from " + a + " to " + b + " is " + sumodd);
			
		} else {
			System.out.println("Starting number should be less then ending number");
		}
	}
}
