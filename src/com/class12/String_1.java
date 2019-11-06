package com.class12;

public class String_1 {

	public static void main(String[] args) {
		
		// 1st way
		String name1="Asif";
		System.out.println(name1);
		System.out.println("name1 length is  "+name1.length());
		System.out.println("--------------");
		
		
		// second way
		
		String name2= new String("KhanKhan");
		System.out.println(name2);
		System.out.println("name2 length is  "+name2.length());
		
		System.out.println("###############################################");
		
		String str1= "AsiF kHAn";
		System.out.println("Before   "+str1);
		
		str1= str1.toLowerCase();  // change it lowercase
		System.out.println("After   "+str1);
		
		str1= str1.toUpperCase();  // change it to uppercase
		System.out.println("After  "+str1);
		
		System.out.println("##########################################");
		
	}

}
