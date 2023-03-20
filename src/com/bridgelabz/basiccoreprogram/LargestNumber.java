package com.bridgelabz.basiccoreprogram;

public class LargestNumber {

	public static void main(String[] args) {
		
		int arr[]= {4,2,1};
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println(largest);
	}
}
