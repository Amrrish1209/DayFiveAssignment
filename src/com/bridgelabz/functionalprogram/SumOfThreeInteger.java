package com.bridgelabz.functionalprogram;
import java.util.Arrays;
public class SumOfThreeInteger {

	public static void main(String[] args) {
		
		int arr[]= {1,-2,3,4,-3,-1,-4,2};
		int n=arr.length;
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n-2;i++) {
			int j=i+1;
			int k=n-1;
			while(j<k) {
				int sum=arr[i]+arr[j]+arr[k];
				if (sum==0) {
					count++;
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					j++;
					k--;
				}
				else if(sum<0) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		System.out.println("Number of distinct triplets that sum to 0: "+count);
	}
}
