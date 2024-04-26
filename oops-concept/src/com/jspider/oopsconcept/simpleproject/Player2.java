package com.jspider.oopsconcept.simpleproject;

public class Player2 extends Player1 {
private int health;
private boolean aurmor;
public Player2(String name, String wepaon, int health, boolean aurmor) {
	super(name, wepaon, health);
	this.health = health;
	this.aurmor = aurmor;
}
@Override
public void hitByGun1() {
	if (aurmor) {
		this.health-=20;
		if (this.health<=0) this.health=0;
		System.out.println("Aurmor is on. Got hit by gun 1.Health reduced by 20"+
				"New Health is "+this.health);
	}
	if (!aurmor) {
		this.health-=30;
		if (this.health<=0)this.health=0;
		System.out.println("Aurmor is off. Got hit by gun 1. Health reduced by 30"+
		 "New health is "+this.health);
	}
if (this.health==0) {
	System.out.println(getName()+"is dead");
}
}
@Override
public void hitByGun2() {
	if (aurmor) {
		this.health-=40;
		if (this.health<=0) this.health=0;
		System.out.println("Aurmor is on. Got hit by gun 2.Health reduced by 40"+
				"New Health is "+this.health);
	}
	if (!aurmor) {
		this.health-=50;
		if (this.health<=0)this.health=0;
		System.out.println("Aurmor is off. Got hit by gun 2. Health reduced by 50"+
		 "New health is "+this.health);
	}
	if (this.health==0) {
		System.out.println(getName()+"is dead");
	}
}
@Override
public void heal() {
	super.heal();
}
}
