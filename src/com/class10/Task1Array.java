package com.class10;

public class Task1Array {

	public static void main(String[] args) {
		
		String[] country= {"USA","England","Turky","Germany"};
		
		for(int i=0; i<country.length; i++) {
			
		switch (country[i]) {
		
		case "USA":
		System.out.println("WAshington");
		break;
		case "England":
			System.out.println("London");
			break;
		case "Turky":
			System.out.println("Ankara");
			break;
		case "Germany":
			System.out.println("Berlin");
			break;
		}	
		}

	}

}
