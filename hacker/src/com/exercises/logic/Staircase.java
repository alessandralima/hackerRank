package com.exercises.logic;

import java.util.Scanner;

public class Staircase {
	
	// Print a staircase of size  using # symbols and spaces.
	static String buildRow(int pos, int size) {
		String row = "";
		int total = size - pos;
		
		// Number of space needed
        for(int i = 1; i <= total; i++){
            
        	row += " ";

        }		
        
        // Number of # needed
        for(int i = 1; i <= pos; i++){
            
        	row += "#";

        }	        
		
		return row;
	}
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++){
            
        	System.out.println(buildRow(i, n));
        	
        }

    }
    
}
