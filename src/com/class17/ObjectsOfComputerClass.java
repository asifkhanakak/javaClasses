package com.class17;

public class ObjectsOfComputerClass {

	public static void main(String[] args) {

		Computer comp1=new Computer();
		
		comp1.name="HP";
		comp1.size=16;
		comp1.ram=8;
		
		Computer comp2=new Computer();
		comp2.name="Mac";
		comp2.Hdsize=500;
		
		
		System.out.println("i own "+comp2.name+" computer.Screen size is "+comp2.size);
		
		System.out.println("i own "+comp1.name+" computer.Screen size is "+comp1.size);
	}

}
