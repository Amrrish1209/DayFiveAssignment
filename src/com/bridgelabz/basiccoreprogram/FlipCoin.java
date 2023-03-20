package com.bridgelabz.basiccoreprogram;

public class FlipCoin {

	public static void main(String[] args) {
		
		double empcheck = Math.floor(Math.random()*10)%2;
		if(empcheck==1) {
			System.out.println("Head");
		}
		else {
			System.out.println("Tail");
		}
	}
}
