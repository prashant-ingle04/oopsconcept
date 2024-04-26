package com.jspider.oopsconcept.polymorphism;

public class String1 {
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("mam");
		StringBuffer s2=new StringBuffer("");
		for (int i = s1.length()-1; i>=0; i--) {
			s2=s2.append(s1.charAt(i));
		}
//		System.out.println(s1);
		System.out.println(s2);
		
		if (s1.equals(s2)) {
			System.out.println("String is palindrome");
		}
//		else {
//			System.out.println("sorry");
//		}
	}

}
