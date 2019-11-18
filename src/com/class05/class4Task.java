package com.class05;

import java.util.Scanner;

public class class4Task {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter number of years worked: ");
	int	years=scan.nextInt();
	
	if (years>=5) {
		System.out.println("you are eligible for bonus");
		
		System.out.print("please enter your salary: ");
		int salary=scan.nextInt();
		if (salary>50000) {
			System.out.println("Your bonous is 5000");
		}else {
			System.out.println("your bonus is 3000");
		}
			
	}else {
		System.out.println("you are not eligible for bonus");
	}
		
		
		
		
		

	}

}
