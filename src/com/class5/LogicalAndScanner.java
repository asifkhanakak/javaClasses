package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		
		/*enter age
		 * 1 to 3 is baby
		 * 3 to 5 toddler
		 * 5 to 12 kid
		 * 12 to 19 teenager
		 * 20 or more is adult
		 */

		int age;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.print("Please enter your age:  ");
		age = scan.nextInt();

		if (age >= 1 && age <= 3) {
			System.out.println("You are a baby ");
		} else if (age >= 3 && age <= 5) {
			System.out.println("You are a toddler");
		} else if (age >= 5 && age <= 12) {
			System.out.println("You are a kid");
		} else if (age >= 12 && age <= 19) {
			System.out.println("you are a teenager");
		} else if (age > 20) {
			System.out.println("you are an adult");
		} else {
			System.out.println("Invalid age enterd");
		}

	}

}
