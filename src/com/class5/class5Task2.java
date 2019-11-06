package com.class5;

import java.util.Scanner;

public class class5Task2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter your height:  ");
		int height=scan.nextInt();
		
		if (height<5) {
			System.out.println("Short");
		}else if (height>=5 && height<=6) {
			System.out.println("Medium");
		}else if(height>6) {
			System.out.println("Tall");
		}

	}

}
