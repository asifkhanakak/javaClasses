package com.class13;

public class Task1_StringManap {

	public static void main(String[] args) {
		// print Reverse
		
		String  day="Sunday";
		System.out.println(day.length());
		//Length of string is 6 but index value start with 0 e.g in this case it is
		// 0,1,2,3,4,5
		
		
		//for(int i=day.length(); i>=0; i--) // will be out of bound Exception
		
		for(int i=day.length()-1; i>=0; i--)	{	
			System.out.print(day.charAt(i));
		}
		
		
		
		
	}

}
