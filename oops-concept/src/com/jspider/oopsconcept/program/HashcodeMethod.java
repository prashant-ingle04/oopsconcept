package com.jspider.oopsconcept.program;

public class HashcodeMethod {
public static void main(String[] args) {
HashcodeMethod hashcodeMethod=new HashcodeMethod("java", 44);
HashcodeMethod hashcodeMethod2=new HashcodeMethod("c++",44);
System.out.println(hashcodeMethod.hashCode());
System.out.println(hashcodeMethod2.hashCode());
}
String bname;
int bid;
public HashcodeMethod(String bname, int bid) {
	this.bname = bname;
	this.bid = bid;
}
public int hashCode() {
	int b1=bname.hashCode();
	int b2=bid;
	return b1+b2;
}
}
