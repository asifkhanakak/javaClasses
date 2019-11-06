package com.class3;

public abstract class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// finding if a Number is even or Odd

		int num = 1012;
		int calculate = (num % 2);

		if (calculate == 0) {
			System.out.println(num + " is an Even Number");

		} else {
			System.out.println(num + " is an Odd Number");
		}
	}
}