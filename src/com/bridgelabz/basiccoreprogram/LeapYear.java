package com.bridgelabz.basiccoreprogram;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=1806;
		if (year>999 && year<9999 ) {
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				System.out.println(year+" is a Leap Year");
			}
			else {
				System.out.println(year+" is not a Leap Year");
			}
		}
		else {
			System.out.println("Enter 4 digit number");
		}	
	}
}
