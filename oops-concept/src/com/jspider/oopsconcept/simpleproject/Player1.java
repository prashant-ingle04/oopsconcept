package com.jspider.oopsconcept.simpleproject;

public class Player1 {
private String name;
private String wepaon;
private int health;
public Player1(String name, String wepaon, int health) {
	super();
	this.name = name;
	this.wepaon = wepaon;
	this.health = health;
	if (health<0 || health>100) {
		this.health=100;
	} else {
		this.health=health;
	}
}
public void hitByGun1() {
	this.health-=30;
	if (this.health<=0) {
		this.health=0;
	}
	System.out.println("Got hit by gun 1. Health reduced by 30"
			+ "New health is "+this.health);
	if (this.health==0) {
		System.out.println(getName()+" is dead");
	}
}
public void hitByGun2() {
	this.health-=50;
	if (this.health<=0) {
		this.health=0;
	}
	System.out.println("Got hit by gun 2. Health reduced by 50"
			+ "New health is "+this.health);
	if (this.health==0) {
		System.out.println(getName()+" is dead");
	}
}
public void heal() {
	if (this.health<=0) {
		System.out.println(getName()+"is dead.Heal is not possible");
	} else {
		this.health=100;
		System.out.println("Health is "+this.health);
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWepaon() {
	return wepaon;
}
public void setWepaon(String wepaon) {
	this.wepaon = wepaon;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
}
