package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
String apply; Scanner scan;

     for(int i=1; i<=10; i++) {
    	 scan=new Scanner(System.in);
    	 System.out.print("Would you like to apply for credit card ");
    	 apply=scan.nextLine();
    	 if(apply.equalsIgnoreCase("yes")) {
    		 break;
    	 }
     }
		
		

	}
}
