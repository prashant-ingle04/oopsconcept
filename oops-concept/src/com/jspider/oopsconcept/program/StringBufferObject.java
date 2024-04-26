package com.jspider.oopsconcept.program;

public class StringBufferObject {
public static void main(String[] args) {
//	StringBuffer stringBuffer=new StringBuffer("Ingle ");
//	StringBuffer stringBuffer2=new StringBuffer("Prashant");
//	System.out.println("Before appending");
//	System.out.println(stringBuffer);
//	System.out.println(stringBuffer2);
//	System.out.println("After appending");
//	stringBuffer.append(stringBuffer2);
//	System.out.println(stringBuffer);
	
	StringBuffer stringBuffer=new StringBuffer("MadaM");
	StringBuffer stringBuffer2=new StringBuffer("");
	for (int i = stringBuffer.length()-1; i>=0; i--) {
		stringBuffer2=stringBuffer2.append(stringBuffer.charAt(i));
	}
	System.out.println(stringBuffer2);
	
	if (stringBuffer.equals(stringBuffer2)) {
		System.out.println("String is a Palindrome");
	}else {
		System.out.println("String is not Palindrome");
	}
}
}
