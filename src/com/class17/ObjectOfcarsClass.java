package com.class17;

public class ObjectOfcarsClass {

	public static void main(String[] args) {

		cars car1=new cars();
		car1.colour="Black";
		car1.make="toyota";
		car1.wheels=4;
		car1.speed=100;
		
		cars car2=new cars();
		car2.make="honda";
		car2.model="civic";
		car2.speed=150;
		car2.wheels=5;
		
		System.out.println("i have "+car1.make+" and colour is "+car1.colour);
		System.out.println("I will buy "+car2.make+" "+car2.model);
		
		car1.drive();
		car2.start();
		
		
		
		
		
	}

}
