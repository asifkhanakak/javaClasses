package com.class8;

public class Task1 {

	public static void main(String[] args) {
	
		for(int a=1; a<=50; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.print(a+" ");
		}
	}

}
