package com.jspider.oopsconcept.program;

public class AccountDriver {
public static void main(String[] args) {
	Account account=new Account("Prashant",12345,5000);
	account.getAttributes();
	
	System.out.println(account.getName());
	
	account.setName("Patil", 12345);
	System.out.println(account.getName());
	account.getAttributes();
	
	System.out.println(account.getBalance());
	
	account.setBalance(5000, 12345);
	System.out.println(account.getBalance());
	account.getAttributes();
}
}
