package com.class7;

public class Task {

	public static void main(String[] args) {
		
		boolean workday=true;
		int day=1;
		
		while(day<6) {
			if(workday) {
				System.out.println("I need a day off");
			}
			day++;
		}
			
		System.out.println("I do not need a day off anymore");
		System.out.println("**************************************");
		workday=true;
		day=1;
		
		while(workday) {
			
			if (day==6) {
				System.out.println("Ido not need a day off");
				workday=false;
			}else{System.out.println("I need a day off");
			}day++;
		}
	
	}}	
		
		
		
		
		
		
		
		
	


