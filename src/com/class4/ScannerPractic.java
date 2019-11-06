package com.class4;

import java.util.Scanner;

public class ScannerPractic {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter first number");
	int num1= keyboard.nextInt();
	System.out.println("enter second number");
int num2=keyboard.nextInt();

if (num1>num2){
	System.out.println(num1+" is larger then "+num2);
}  else if(num1==num2){
	System.out.println("both number are equal");
	 }
 else{

 System.out.println(num2+" is largerthen "+num1);
		
	}
    keyboard.close();
}


	}


