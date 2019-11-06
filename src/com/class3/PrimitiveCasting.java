package com.class3;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
	
	double d=12;
	System.out.println(d);
	// int i=12.0 compiler error
	byte b=127;
	int i=b;
	
	System.out.println(i); // puting small number into long data type
	
	
	// narrowing or explicit or manual casting
	
	double d2=123.76;
	int num2=(int)d2;
	System.out.println(num2); // we manually changed it to int otherwise error
	
	int num3= 789;
	byte b1=(byte)num3;
	System.out.println(b1);   // changed num3 int to byte manually. we can not put big buckett
	                           // into small buckett.
	
	
	
	}
	
}
	

