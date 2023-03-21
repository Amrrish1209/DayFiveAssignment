package com.bridgelabz.functionalprogram;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rowLength = sc.nextInt();

        System.out.println("Please enter number of columns");
        int columnLength = sc.nextInt();

        int arr[][] = new int[rowLength][columnLength];

        System.out.println("Please enter array elements");
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       
        printArray(arr, rowLength, columnLength);
       
        sc.close();
    }

    public static void printArray(int arr[][], int rowLength, int columnLength) {
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
	
}
