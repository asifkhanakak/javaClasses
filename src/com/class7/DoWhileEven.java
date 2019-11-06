package com.class7;

public class DoWhileEven {

	public static void main(String[] args) {
		
int n=20;
do {
	if(n%2==0) {
		System.out.print(n+" ");
	}n++;
}while(n<=50);
System.out.println();
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


	n=20;
		do {
			System.out.print(n+" ");  // no if condition but same result
			n+=2;
		}while(n<=50);
		
	}

}
