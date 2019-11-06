package com.class8;

public class ForEven {

	public static void main(String[] args) {
		
		for (int num=20; num>1; num-=2) {
			System.out.print(num+" ");
			
		}
		System.out.println();
		System.out.println("**************************");
		for(int num=20; num>1; num--) {
			if(num%2==0) {
								System.out.print(num+" ");}
			}
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");

	for (int num=21; num<50; num+=2) {
		System.out.print(num+" ");
	}
	System.out.println();
	System.out.println("#########################");
	 for(int num=21; num<50; num++) {
		 if(num%2==1) {
			 System.out.print(num+" ");
		 }
	 }

}}
