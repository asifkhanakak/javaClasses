package com.class11;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
//		creating array Through Scanner
		
		Scanner scan=new Scanner(System.in);
		System.out.print("How many rows you like in your array: ");
		int rows=scan.nextInt();
		System.out.print("How many column you like in your array: ");
		int columns=scan.nextInt();
		
		int[][] myarray=  new int [rows][columns];
		System.out.println("Please enter element of the array : ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				myarray[i][j]=scan.nextInt();
			}
		}
		for(int []getrows:myarray) {
			for(int getvalues:getrows) {
				System.out.print(getvalues+" ");
			}
		System.out.println();
	   }
		

	}

}
