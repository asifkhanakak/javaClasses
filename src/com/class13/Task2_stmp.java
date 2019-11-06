package com.class13;

public class Task2_stmp {

	public static void main(String[] args) {
		
		
		//print the middle corrector of the string if string length is odd number
		String str2 = "ASIFkhan1";
		System.out.println(str2.length());
        
	       if (!str2.isEmpty()) {
	           if (str2.length() % 2  != 0) {
	               System.out.print(str2.charAt(str2.length()/2));
	           }else {
	           System.err.println("Error");
	       }
	        
	        
	       }
	




	}

}
