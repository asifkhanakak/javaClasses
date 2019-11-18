package com.class04;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("please enter a number:");
	int number=scan.nextInt();	
	System.out.println("The enterd number is "+number);
	
System.out.println("#############################");
	
	Scanner scan2=new Scanner(System.in);  //  no need to create a new scanner, can use "scan" at line 9
	System.out.print("Enter your name:");
	System.out.println();
	
	String name=scan2.nextLine();
	System.out.println("Good Morning "+name);
	
	scan.close(); scan2.close();
	}

	
	}


