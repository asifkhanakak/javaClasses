package com.class11;

public class Task3 {

	public static void main(String[] args) {
		
		
		String[] country= {"Afghanistan","Pakistan","USA"};
		String[] capitals= {"Kabul","Islamabad","Washington"};
		
		for(int i=0; i<3;i++) {
			System.out.println(country[i]+" Capital is "+capitals[i]);
		}
		System.out.println("------------------------");
		
		for(String getcountry:country) {
			if (getcountry.equals("Pakistan")){
				System.out.println("capital is "+capitals[1]);
				
			}
		}

	}

}
