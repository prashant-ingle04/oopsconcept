package com.jspider.oopsconcept.program;

public class Account {
private String account_holder_name;
private int acc_no;
private double balance;
public Account(String account_holder_name,int acc_no,double balance) {
	this.account_holder_name=account_holder_name;
	this.acc_no=acc_no;
	this.balance=balance;
}
public String getName(){
	return account_holder_name;
}
public void setName(String name,int old_acc_no) {
	if (this.acc_no==old_acc_no) {
		this.account_holder_name=name;
		System.out.println("Account holder name changed successfully");
	} else {
		System.out.println("Invalid account number");
	}
}
public int getnumber() {
	return acc_no;
}
public double getBalance() {
	return balance;
}
public void setBalance(int amount,int old_acc_no) {
	if (this.acc_no==old_acc_no) {
		this.balance=this.balance+amount;
		System.out.println("Amount deposited successfully");
	} else {
        System.out.println("Invalid account number");
	}
}
public void setWithdraw(double amount,int old_acc_no) {
	if (this.acc_no==old_acc_no) {
		this.balance=this.balance-amount;
		System.out.println("Amount withdrawl successfully");
	} else {
        System.out.println("Invalid account number");
	}
}
public void getAttributes() {
	System.out.println("the account holder name is "+account_holder_name);
	System.out.println("the account  number is "+acc_no);
	System.out.println("the account balance is "+balance);

}
}
