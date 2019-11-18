package com.class07;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean IsRain;
		
		do {
			
			System.out.println("Is it Raning");
			IsRain=scan.nextBoolean();
		}while(IsRain);
		System.out.println("Its not Raning: Go to the park");
		
		
	
scan.close();
}}
