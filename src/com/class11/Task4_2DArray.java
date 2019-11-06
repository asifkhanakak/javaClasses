package com.class11;

public class Task4_2DArray {

	public static void main(String[] args) {
		
		int[] [] num = {
				{10,20,30,40},
				{100,200,300,400},
				{ 1,2,3,4}
		};
		
		for(int getrows[]:num) {
			for(int getvalues:getrows) {
				System.out.print(getvalues+"  ");
			}
			System.out.println();
		}
		
		
		

	}

}
