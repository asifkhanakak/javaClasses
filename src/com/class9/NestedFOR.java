package com.class9;

public class NestedFOR {

	public static void main(String[] args) {
		
	/*	1
		2 3
		4 5 6
		7 8 9 10 */
		int c=1;
		
		for(int a=1; a<=4;a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(c+++" ");
				
			}
			System.out.println();
				
			
			}
		}

	}


