package com.class4;

public class NestedIfInside {
	public static void main(String[] args) {
		boolean quiz=true;
		int score=80;
		
		if (quiz) {
			System.out.println("good Job");
		       if(score>=90) {
		       System.out.println("grade A");
		       }else if(score<89) {
		    	   System.out.println("grade B");
		       }else {
		    	   System.out.println("You should have studied more");
		       }
		
		}else {
			System.out.println("Not good");
		}
		
		
	}

}
