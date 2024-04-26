package com.jspider.oopsconcept.simpleproject;

public class GameMain {
public static void main(String[] args) {
	Player1 player1=new Player1("Patil","AK47",100);
//	System.out.println(player1.getName());
//	System.out.println(player1.getWepaon());
//	System.out.println(player1.getHealth());
//	
//	player1.hitByGun1();
//	player1.hitByGun1();
//	player1.hitByGun1();
//	player1.heal();
//	player1.hitByGun1();
	
	Player2 player2=new Player2("Prashant", "Machine Gun", 100, false);
	player2.hitByGun1();
	player2.hitByGun2();
	player2.heal();
	
}
}
