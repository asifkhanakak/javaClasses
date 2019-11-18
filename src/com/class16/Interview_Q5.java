package com.class16;

public class Interview_Q5 {

	public static void main(String[] args) {

		// Reverse a string character by character

		String str = " Today is Sunday";
		// first way, using charAt
		System.out.println(str);
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("----------------------------------");

		// second way, converting it to charArray
		char[] strarray = str.toCharArray();
		// System.out.println("Length of char Array "+strarray.length);
		System.out.println(str);
		for (int i = strarray.length - 1; i >= 0; i--) {
			System.out.print(strarray[i]);
		}
		System.out.println();
		System.out.println("_______________________________________________________");

		String[] wordarray = str.split(" ");
		// System.out.println(wordarray.length);
		System.out.println(str);
		String last = "";
		for (int i = 0; i < wordarray.length; i++) {
			for (int j = wordarray[i].length() - 1; j >= 0; j--) {
				last = wordarray[i].substring(j, j + 1);
				System.out.print(last);
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");

		// Write a java program to reverse String? Reverse a string word by word?
		System.out.println(str);
		String reversed = "";
		String[] array2 = str.split("\\s");
		for (int i = array2.length - 1; i >= 0; i--) {
			reversed = reversed + array2[i] + " ";
		}
		System.out.println(reversed);

	}

}
