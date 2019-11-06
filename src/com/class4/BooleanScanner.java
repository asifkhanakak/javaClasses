package com.class4;

import java.util.Scanner;

public class BooleanScanner {
	 public static void main(String[]args){
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Input the boolean value");
		    boolean value=scan.nextBoolean();
		    System.out.println("the value is "+value);
		   
		   scan.close();
	 }
}
