package com.class15;

import java.util.Arrays;


public class Interview_Q2 {

	public static void main(String[] args) {

//		Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int[] myarray = { 22, 3, 34, 6,10,344,759 };
		
		// first Soluation, Sorting thre Array
		Arrays.sort(myarray);
		System.out.println("the smmallest numberis "+myarray[0]);
		System.out.println("the largest number is "+myarray[myarray.length-1]);
		System.out.println("the second largest is "+myarray[myarray.length-2]);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println();
		
		// Second way  comparing
		int[] myarray2= {20,-10,377,878,865,6,9};
		
		int largest = myarray2[0];
		int smallest = myarray2[0];
		int secondlargest = myarray2[0];

		for (int i = 0; i < myarray2.length; i++) {

			System.out.print(myarray2[i] + " ");
			
			if (myarray2[i] > largest) {
				 secondlargest=largest;
				 largest = myarray2[i];
			}
			if (myarray2[i]>secondlargest && myarray2[i]<largest) {
				secondlargest = myarray2[i];
			}
			if (smallest > myarray2[i]) {
				smallest = myarray2[i];
			}

		}
		System.out.println();
		System.out.println("The largest element in the array is :" + largest);
		System.out.println("The Smallest element in the array is :" + smallest);
		System.out.println("The Second largest number in the array is :"+secondlargest);
	
	}
}
