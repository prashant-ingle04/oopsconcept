package com.jspider.oopsconcept.simpleproject;

import java.util.HashSet;
import java.util.Set;
public class IntersectionSet {

	

	
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

	        // Find the intersection by creating a new set and using the retainAll method
	        Set<Integer> intersection = new HashSet<>(set1);
	        intersection.retainAll(set2);

	        // Display the intersection set
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Intersection Set: " + intersection);
	    }
	}


