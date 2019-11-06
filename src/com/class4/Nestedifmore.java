package com.class4;

public class Nestedifmore {
	public static void main(String[] args) {
		
		int age=17;
		
		if (age<16) {
			System.out.println("you are too young to drive");
		}else {
			if(age>=18) {
				System.out.println("you are eligible to drive");
			}else {
				System.out.println(" 17 years old,you need your parents to drive you");
			}
		}
			
		
	}

}