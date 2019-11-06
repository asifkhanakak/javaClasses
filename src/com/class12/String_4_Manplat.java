package com.class12;

public class String_4_Manplat {

	public static void main(String[] args) {
		
		String str1,str2,str3,str4;
		str1= "Hello"; str2="World"; str3="Good Morning";
		
		System.out.println(str1+str2+str3);
		System.out.println();
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2).concat(str3));
		System.out.println("#####################################");
		
		str4= "     this method will terminate space at brging and end of the string   ";
		System.out.println(str4);
		System.out.println(str4.trim());
		System.out.println("#####################################3");
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.indexOf('H'));
		System.out.println(str1.indexOf('h'));
		System.out.println("####################");
		
		String str5=" Hello Hi ";
		System.out.println(str5.indexOf("H"));
		System.out.println(str5.indexOf("H",3));
		
		

	}

}
