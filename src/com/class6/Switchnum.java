package com.class6;

import java.util.Scanner;

public class Switchnum {

	public static void main(String[] args) {
		 int monthnum;
		    Scanner scan;
		    String monthname;
		    
		    scan=new Scanner(System.in);
		    System.out.print("Please input month number: ");
		    monthnum=scan.nextInt();
		    
		    switch(monthnum){
		      
		     
		      case 1:
		      monthname=  "January";
		      break;
		       case 2:
		      monthname=  "feburary";
		      break;
		       case 3:
		      monthname=  "March";
		      break;
		       case 4:
		      monthname=  "April";
		      break;
		       case 5:
		      monthname=  "May";
		      break;
		       case 6:
		      monthname=  "June";
		      break;
		       case 7:
		      monthname=  "July";
		      break;
		       case 8:
		      monthname=  "August";
		      break;
		       case 9:
		      monthname=  "September";
		      break;
		       case 10:
		      monthname=  "October";
		      break;
		       case 11:
		      monthname=  "November";
		      break;
		       case 12:
		      monthname=  "December";
		      break;
		      default:
		      monthname=  "Invalid";
		    }
		    System.out.println(monthname);
		    
		    scan.close();

	}

}
