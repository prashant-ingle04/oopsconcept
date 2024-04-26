package com.jspider.oopsconcept.program;

public class CopyConstructer {
	int a;
	String bString;
public CopyConstructer() {
	 a=10;
	 bString="Patil";
	System.out.println(a+ " " +bString);
}
public CopyConstructer(CopyConstructer ref) {
	int a=ref.a;
	String bString=ref.bString;
	System.out.println(a+ " " +bString);
}
}

	

