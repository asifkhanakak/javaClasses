package com.class9;

public class Assit70 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			System.out.print("$");
		}
		for (int j=1; j<=2; j++) {
			System.out.println();
			System.out.print("$  $");
		}
		System.out.println();
		for(int k=1; k<=4; k++) {
			
			System.out.print("$");
		}
	}}
	
       /*  Teacher Soluation
        * 
        *  for (int i=1; i<=4; i++) {
  	      for (int j=1; j<=4; j++) {
		
		if (i==1 || i==4 || j==1 || j==4) {
			System.out.print("$");
		} else {
			System.out.print(" ");
		}
	       } System.out.println();
         }
	*/
