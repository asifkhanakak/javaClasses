package com.class5;

import java.util.Scanner;

public class logicalAnd {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number ");
	int	num=scan.nextInt();
	
	if(num>1 && num<10) {
		System.out.println("This number is small");
		
	}else if (num>=10 && num<100) {
		
		System.out.println("This is a medium number");
		
	}else if(num>=100 && num<1000) {
		System.out.println("this is a large number");
	}
		
		
		

	 else

	{
		System.out.println("Number is out of range");
	}
}
}
