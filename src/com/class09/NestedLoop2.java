package com.class09;

public class NestedLoop2 {

	public static void main(String[] args) {

		for (int a = 0; a < 6; a++) { // Outter Loop control ROWS

			for (int b = 0; b < 3; b++) { // Inner loop controls COLUMNS
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
