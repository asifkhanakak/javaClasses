package com.class13;

public class Task_1 {

	public static void main(String[] args) {
		
		
		String str="sunday";  // print this string in reverse order
		String str1="today is elecation day";
		
		char[] mystr=str.toCharArray();   // convert string to char Array
		for(int i=mystr.length-1; i>=0; i--) {
			System.out.print(mystr[i]+" ");
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		for (int i=str.length()-1; i>=0;i--) {
				System.out.print(str.charAt(i)+" "); // no need for converting string to array. using charAt() Method
		}
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		
		char [] mystr1=str1.toCharArray();  // convert string in char array
		for(int i=mystr1.length-1; i>=0; i--) {
			System.out.print(mystr1[i]+" ");
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		for(int i=str1.length()-1; i>=0; i--)
		System.out.print(str1.charAt(i)+" ");
		
	}

}
