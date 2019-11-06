package com.class14;

public class SplitString {

	public static void main(String[] args) {
		
		
		
						/*.split()
				 * This method splits this string around matches of the given regular expression.*/
				 
				
				//split the following string into array of strings/work
				String str="Video provides a powerful way to help you prove your point.";
				
				String[] array=str.split(" ");
				
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
				}
				String str1="My name is asif. im good. how r u. thats good.";
				String [] array2=str1.split("\\.");
				System.out.println("number of sentences is  "+array2.length);
				System.out.println("#################################################");
				
			String str2="welcomt to alexandria va";
		String [] array3=str2.split(" ", 2);
		System.out.println(array3.length);
		for(int i=0; i<array3.length;i++) {
			System.out.println(array3[i]);
		}

	}}

