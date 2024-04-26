package com.jspider.oopsconcept.program;

public class Array {
public static void main(String[] args) {
	int a[]= {6,9,7,2,4,5,10,12};
	for (int i = 0; i <= a.length-1; i++) {
		int count=0;
		for (int j = 1; j <=a[i]; j++) {
			if (a[i]%j==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(a[i]+" is a prime number");
		}
	}
}
}
