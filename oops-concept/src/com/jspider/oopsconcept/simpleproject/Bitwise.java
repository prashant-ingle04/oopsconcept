package com.jspider.oopsconcept.simpleproject;

import java.util.HashSet;
import java.util.Set;
public class Bitwise {
	

	
	    public static void main(String[] args) {
	        String bitString1 = "110101";
	        String bitString2 = "101110";

	        Set<String> bitwiseAndSet = new HashSet<>();
	        Set<String> bitwiseOrSet = new HashSet<>();
	        Set<String> bitwiseXorSet = new HashSet<>();

	        int n = bitString1.length();

	        for (int i = 0; i < n; i++) {
	            char bit1 = bitString1.charAt(i);
	            char bit2 = bitString2.charAt(i);

	            // Bitwise AND
	            char resultAnd = (bit1 == '1' && bit2 == '1') ? '1' : '0';
	            bitwiseAndSet.add(resultAnd + "");

	            // Bitwise OR
	            char resultOr = (bit1 == '1' || bit2 == '1') ? '1' : '0';
	            bitwiseOrSet.add(resultOr + "");

	            // Bitwise XOR
	            char resultXor = (bit1 != bit2) ? '1' : '0';
	            bitwiseXorSet.add(resultXor + "");
	        }

	        System.out.println("Bitwise AND Set: " + bitwiseAndSet);
	        System.out.println("Bitwise OR Set: " + bitwiseOrSet);
	        System.out.println("Bitwise XOR Set: " + bitwiseXorSet);
	    }
	}

