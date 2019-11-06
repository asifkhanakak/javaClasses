package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		
		int day=4;
		
		  if(day==1) {
			System.out.println("Monday,No class today");
			
		}else if(day==2) {
			System.out.println("Tuesday SDLC class today");
		}
		else if(day==3) {
			System.out.println("wedensday Review Class");
		}else if(day==4) {
		System.out.println("Thursday SDLC Class");
		}else if(day==5) {
			System.out.println("Friday no class today");
		}else if(day==6) {
			System.out.println("Saturday Java class today");
		}else if(day==7) {
			System.out.println("Sunday Java class today");
			
		}else { 
			System.out.println("Enter a valid day number");
		}
	}

}