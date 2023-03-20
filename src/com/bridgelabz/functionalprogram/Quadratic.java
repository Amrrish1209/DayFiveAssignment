package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b:");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c:");
		double c = sc.nextDouble();
		double d = b * b - 4.0 * a * c;
		if (d > 0.0) {
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("The root are " + r1 + "and " + r2);
		} else {
			System.out.println("Roots are not real");
		}
		sc.close();

	}
}
