package com.class10;

public class array4 {

	public static void main(String[] args) {
		
		String[] animals= {"Cat","Dog","snake","camel"};
		
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			if(animals[i].equals("Dog")) {
				System.out.println(animals[i]);
				System.out.println("I love dogs");
			}
			else {
				System.out.println(animals[i]);
			}
		}

	}

}
