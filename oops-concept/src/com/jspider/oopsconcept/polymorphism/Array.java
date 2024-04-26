package com.jspider.oopsconcept.polymorphism;

public class Array {
	public static void main(String[] args) {
		int arr[]= {6,93,390,58,42,88};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
// class Array{
//	public static void main(String[] args) {
//		int arr[]= {6,93,67,390,53,42,88,5,3,11};
//		for (int i = 0; i < arr.length; i++) {
//			int count=0;
//			for (int j = 1; j <=arr[i]; j++) {
//				if (arr[i]%j==0) {
//					count++;
//				}	
//			}
//			if (count==2) {
//				System.out.println("the prime numbers are "+arr[i]);
//			}
//			}
//		}
//	}
//}


