package com.class09;

import java.util.Scanner;

public class NestedLoopTask4 {

	public static void main(String[] args) {
		
		int secnum=17;
		
		Scanner scan =new Scanner(System.in);
		
		for(int i=1; i<=20; i++) {
			System.out.print("Guess the secret number: ");
			int num=scan.nextInt();
			
			if(num>secnum) {
				System.out.println("The number entered was too large");
			}else if(num<secnum) {
				System.out.println("The number entered was too small");
			}else if(num==secnum) {
				System.out.println("Congratulation! You got it");
				i=21;
			}
		}
		//  Best solution for the above problem
		
		/*  do
		 * System.out.print("Guess the secret number: ");
		 
		*	int num=scan.nextInt();
			
		*	if(num>secnum) {
		*		System.out.println("The number entered was too large");
		*	}else if(num<secnum) {
		*		System.out.println("The number entered was too small");
		*	}else if(num==secnum) {
		*		System.out.println("Congratulation! You got it");
		*		
		*		while(num!=secnum)
		 */
	}
}
