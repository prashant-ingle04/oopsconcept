package com.jspider.oopsconcept.simpleproject;

import java.util.HashSet;
import java.util.Set;
public class UnionSet {

	    public static void main(String[] args) {
	        // Create two sets
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        // Add elements to the first set
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);

	        // Add elements to the second set
	        set2.add(3);
	        set2.add(4);
	        set2.add(5);
	        set2.add(6);

	        // Create a new set to store the union
	        Set<Integer> union = new HashSet<>(set1);

	        // Use the addAll method to add elements from the second set to the union set
	        union.addAll(set2);

	        // Display the union set
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Union Set: " + union);
	    }
	}


