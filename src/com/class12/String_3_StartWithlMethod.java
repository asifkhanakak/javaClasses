package com.class12;

public class String_3_StartWithlMethod {

	public static void main(String[] args) {
		
		String str1= "HeLlO woRld";
		
		String str2= "HELLO WORLD";
		String str3="";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("start with   "+str2.startsWith("HELLO"));
		System.out.println("Start with "+str2.startsWith("hello"));
		
		System.out.println(str1.isEmpty());
		System.out.println(str3.isEmpty());
	}

}
