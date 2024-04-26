package com.jspider.oopsconcept.simpleproject;

import java.util.HashSet;
import java.util.Set;
public class ComplimentSet {




	    public static void main(String[] args) {
	        // Create a universal set
	        Set<Integer> universalSet = new HashSet<>();
	        for (int i = 1; i <= 10; i++) {
	            universalSet.add(i);
	        }

	        // Create a set for which you want to find the complement
	        Set<Integer> givenSet = new HashSet<>();
	        givenSet.add(2);
	        givenSet.add(4);
	        givenSet.add(6);
	        givenSet.add(8);

	        // Find the complement by creating a new set and adding elements not in the given set
	        Set<Integer> complement = new HashSet<>(universalSet);
	        complement.removeAll(givenSet);

	        // Display the complement set
	        System.out.println("Universal Set: " + universalSet);
	        System.out.println("Given Set: " + givenSet);
	        System.out.println("Complement Set: " + complement);
	    }
	}


