package com.class5;

import java.util.Scanner;

public class ComlexIFElse {

	public static void main(String[] args) {

		Scanner input;
		int quiz, midTerm, finall;
		input = new Scanner(System.in);
		System.out.print("Enter Quiz score: ");
		quiz = input.nextInt();
		System.out.print("Enter midterm score: ");
		midTerm = input.nextInt();
		System.out.print("Enter final score");
		finall = input.nextInt();
		int average = ((quiz + midTerm + finall) / 3);

		if ((quiz <= 0) || (midTerm <= 0) || (finall <= 0)) {
			System.out.println("Invalid entery, Score value can not be zero");
		} else {

			if ((quiz > 100) || (midTerm > 100) || (finall > 100)) {
				System.out.println("Invalid entery: you have enterd score value more then 100");
			} else {

				if (average >= 90) {
					System.out.println("Grade A");
				} else if (average >= 70 && average < 90) {
					System.out.println("Grade B");
				} else if (average >= 50 && average < 70) {
					System.out.println("Grade C");
				} else if (average < 50) {
					System.out.println("Grade F");
				}
			}
		}

	}
}
