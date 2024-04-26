package com.jspider.oopsconcept.simpleproject;

import java.util.HashSet;
import java.util.Set;
public class DifferenceSymmetricDifference {

	

	
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

	        // Find the difference of the sets
	        Set<Integer> difference1 = new HashSet<>(set1);
	        difference1.removeAll(set2); // Elements in set1 but not in set2

	        Set<Integer> difference2 = new HashSet<>(set2);
	        difference2.removeAll(set1); // Elements in set2 but not in set1

	        // Find the symmetric difference
	        Set<Integer> symmetricDifference = new HashSet<>(set1);
	        symmetricDifference.addAll(set2); // Elements in either set1 or set2

	        symmetricDifference.removeAll(set1); // Remove elements in the intersection

	        // Display the results
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Difference (Set1 - Set2): " + difference1);
	        System.out.println("Difference (Set2 - Set1): " + difference2);
	        System.out.println("Symmetric Difference: " + symmetricDifference);
	    }
	}


