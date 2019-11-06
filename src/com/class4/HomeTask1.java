package com.class4;

import java.util.Scanner;

public class HomeTask1 {

	public static void main(String[] args) {
		
		Scanner amount= new Scanner(System.in);
		System.out.print("how much loan do you need :");
		int loanAmount=amount.nextInt();
		
		if(loanAmount<200000) {
			System.out.println("we will lend you "+loanAmount);
		}else {
			System.out.println("Sorry we can not lend you "+loanAmount);
		}
amount.close();
	}

}
