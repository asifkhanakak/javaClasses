package com.class10;

public class arrayDuplicate {

	public static void main(String[] args) {
		
		//finding duplicate values in array

		int[] myarray = { 2, 4, 5, 6, 7, 4, 8, 5,2 };

		for (int i = 0; i < myarray.length; i++) {

			for (int j = (i + 1); j < myarray.length; j++) {

				if (myarray[i] == myarray[j]) {
					System.out.println(myarray[j]);
				}

			}
		}

	}
}
