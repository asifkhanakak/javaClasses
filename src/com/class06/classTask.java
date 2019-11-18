package com.class06;

import java.util.Scanner;

public class classTask {

	public static void main(String[] args) {
		Scanner scan;
		String month,season;
		scan=new Scanner(System.in);
		System.out.print("please enter your month of birth : ");
		month=scan.next();
		
		if( month.equals("January")||month.equals("Feburary")||month.equals("December")) {
			season="Winter";
		}else if(month.equals("March")||month.equals("April")) {
			season="Spring";
			}else if(month.equals("may")||month.equals("june")||month.equals("July")) {
				season="Summer";
			}else if(month.equals("September")||month.equals("October")) {
				season="Fall";
			}else {
				season="Unknown";
				
			}
		System.out.println("You were born in: "+season);
		System.out.println(month);
		scan.close();
			}
				}
