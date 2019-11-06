package com.class3;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=40;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
	
	System.out.println("*************************");
	
	double d=1.99;
	double d1=2.99;
	
	boolean b=d<d1;
	System.out.println(b);
	
	
	boolean b2=d>d1;
	boolean b3=d!=d1;
	System.out.println(b2);
	System.out.println(b3);
	System.out.println("*************************");
	
	int mynum1=20;
	int mynum2=30;
	
	if (mynum1<mynum2) {
	  System.out.println("mynum1 is smaller number");
	}else {
		System.out.println("mynum1 is a bigger number");
	}
	
	double teaPrice=4.99;
	double allowedPrice=3.99;
	
	if (teaPrice<=allowedPrice) {
		System.out.println("i will buy");
	}
	else {
		System.out.println("too expesive, Not buying it");
	}
	
	}
	
	
	
}
