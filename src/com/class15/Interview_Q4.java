package com.class15;

public class Interview_Q4 {

	public static void main(String[] args) {
		// How to  find out  the part of the string from a
		//string? What is substring?Find number of words in string?

		String str="My name is asif Khan.I live in Alexandria";
		System.out.println(str.substring(16));
		System.out.println(str.substring(0, 15));
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		
		String str2=str.replace("."," ");
		String []fstr=str2.split(" ");
		System.out.println("Number of words in the string are = "+fstr.length);
		
		
	}}


