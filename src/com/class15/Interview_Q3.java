package com.class15;

public class Interview_Q3 {

	public static void main(String[] args) {
		
		
		String str1="Asif33khan@#  Syntax345(*)";
		System.out.println(str1.length());
		
		String fstr=str1.replaceAll("[ 0-9@#!$%^&*()]", "");
		System.out.println(fstr);
		System.out.println("The number of alpha Character in the above string are= "+fstr.length());
	}

}
