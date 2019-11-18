package com.class05;

import java.util.Scanner;

public class assigningToResult {

	public static void main(String[] args) {
		
		
		Scanner input;
		int quiz, midTerm, finall; 
		String result= null;
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
					result="Grade A";
				} else if (average >= 70 && average < 90) {
					result="Grade B";
				} else if (average >= 50 && average < 70) {
					result="Grade C";
				} else if (average < 50) {
					result="Grade F";
				}
			}
		}
		if(result.equals("Grade A")) {
			System.out.println(result+": Great job");
		}else if(result.equals("Grade B")) {
			System.out.println(result+": Good Job");
		}else if(result.equals("Grade C")) {
			System.out.println(result+" : You should work hard");
		}else if(result.equals("Grade F")) {
			System.out.println(result+" :You have failed");
		}

	}
}

		
		
		
		
		
		
		
		
		
		

	


