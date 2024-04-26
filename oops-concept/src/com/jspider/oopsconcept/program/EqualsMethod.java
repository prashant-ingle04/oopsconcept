package com.jspider.oopsconcept.program;

public class EqualsMethod {
public static void main(String[] args) {
EqualsMethod equalsMethod=new EqualsMethod("java", 44);
EqualsMethod equalsMethod2=new EqualsMethod("java", 99);
System.out.println(equalsMethod.bname);
System.out.println(equalsMethod2.bname);
System.out.println(equalsMethod==equalsMethod2);
System.out.println(equalsMethod.equals(equalsMethod2));
}
String bname;
int bid;
public EqualsMethod(String bname,int bid) {
	this.bname=bname;
	this.bid=bid;
}
public boolean equals(Object o) {
	EqualsMethod equalsMethod=(EqualsMethod)o;
	if (this.bid==equalsMethod.bid) {
		return true;
	} else {
		return false;
	}
}
}
