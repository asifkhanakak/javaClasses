package com.class9;

public class PatternStars {

	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int a=1;a<=5; a++) {
			for(int b=1; b<=a; b++) {
				
				System.out.print("*"+" ");
				}
			System.out.println();
			}
		
		/* 1
		 * 22 
		 * 333
		 * 4444 
		 * 55555
		 * 666666 
		 * 7777777 
		 * 88888888
		 * 999999999 */
		for(int a=1; a<=9;a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
	/*	1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
 */
		
		for(int a=1; a<=9;a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

}}
