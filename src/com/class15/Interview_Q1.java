package com.class15;

public class Interview_Q1 {

	public static void main(String[] args) {
		//Swap value of without new variable
		int a=20;
		int b=10;
		System.out.println("value of a now is "+a+" Value of b is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		

		System.out.println("After swaping value of \"a\" is "+a+" And value of \"b\" is "+b);
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		String s1="Hello"; String s2="Good morning";
		System.out.println("s1 = "+s1+" s2 = "+s2);
		
//		s1=s1+s2;
		s1=s1.concat(s2);
		s2=s1.substring(0,5);
		s1=s1.substring(5);
		System.out.println("s1 is now "+s1+" s2 is now "+s2);
		System.out.println("**********************************");
		
		s1="summer";
		s2="winter";
		System.out.println("s1 = "+s1+" s2 = "+s2);
		
		
		s1=(s1.replaceAll(s1, s2));
		s2=(s2.replaceAll(s2, s1));
		System.out.println("s1 is now "+s1+" s2 is now "+s2);  // did not work
		
	}
}