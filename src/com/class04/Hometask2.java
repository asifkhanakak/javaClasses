package com.class04;

import java.util.Scanner;

public class Hometask2 {

	public static void main(String[] args) {
		
		Scanner age= new Scanner(System.in);
		System.out.println("pleas enter your age");
		int yourAge=age.nextInt();
		if(yourAge>=18) {
			System.out.println("we will issue you Driver license");
		}else {
			System.out.println("You should get lerner permit");
		}
		age.close();		
	}

}
