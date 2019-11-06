package com.class12;

public class Recap {

	public static void main(String[] args) {
		
		String str1="Hello" ;
		String str2=new String ("Hello");
		
		String str4= str1.concat(" World");
		System.out.println(str4);
		
		System.out.println(str4);
		System.out.println(str1.isEmpty());
		
		String str3=str1.toUpperCase();
		System.out.println(str3);
		System.out.println(str1.toUpperCase());
		System.out.println("#########################################");
		boolean cas=str1.equals(str2);
		System.out.println(cas);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);// == operator does not check the reference to the comparing string
		// if two String are created with same contents, java create one string and for the 2nd it has a refrence to/n
		// the first string unless it is created with "new" method.
		
		System.out.println("-------------------------------------");
		String str5="Hello,there, hope you are doing good";
		System.out.println(str5.startsWith("He"));
		System.out.println(str5.startsWith(str1));
		System.out.println(str5.startsWith("Hello     "));
		System.out.println(str5.startsWith("Hello,th"));
		System.out.println(str5.endsWith("good"));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		System.out.println(str5.indexOf("y"));
		System.out.println(str5.indexOf('t'));
		System.out.println(str5.charAt(6));
		System.out.println("=============================================");
		
		String str6="         SundAy";
		System.out.println(str6);
		System.out.println(str6.trim());
		System.out.println(str6.trim().toUpperCase());
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println(str5.contains("hello"));
		System.out.println(str5.contains("Hello"));
		System.out.println(str5.toLowerCase().contains("hello"));
		System.out.println("#######################################");
		
		
		String str7="Java ia getting intresting";
		System.out.println(str7.substring(12));
		System.out.println(str7.substring(0,15));
		
		
		
		
		
	}

}
