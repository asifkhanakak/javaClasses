package com.class13;

public class String_Minp_Class2 {

	public static void main(String[] args) {
		
		
		String str1="Hello Asif How are you";
		System.out.println(str1.replace('H','w'));
		System.out.println(str1.replace("Asif", "Rohaan"));
		System.out.println(str1.replace(" ", ""));
		System.out.println("##########################");
		
		String str2="12345Hey Asif768888";
		System.out.println(str2.replaceAll("[0-9]", ""));// remove number
		System.out.println(str2.replaceAll("[a-z]", "")); // remove lowercase only
		System.out.println(str2.replaceAll("[a-zA-Z]", ""));
		System.out.println("--------------------------------------");
		
		String str3="$%%%123()^$#Asif$$$khan";
		System.out.println(str3.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(str3.replaceAll("[^a-z A-Z 0-9]", ""));
		System.out.println(str3.replaceAll("[^a-z A-Z ]", ""));
		

	}

}
