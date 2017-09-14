package com.exercises.logic;

import java.util.Scanner;

public class MinMaxSum {

	// Values will be calculated by summing exactly four of the five integers. 
	static long getSum(int position, int[] ar) {
		long sumRow = 0;
		for(int i = 0; i < ar.length; i++) {
			
			if (i != position) {
				sumRow+= ar[i];
			}
			
		}
		
		return sumRow;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] ar = new int[n];
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        
        // Beware of integer overflow! Use 64-bit Integer.
        long minValue = 0;
        long maxValue = 0;
        long result = 0;
        
        for(int i = 0; i < n; i++) {
            result = getSum (i, ar);
            
            if (i==0) {
            	minValue = result;
            	maxValue = result;
            } 
            else {
            	if (result < minValue) {
            		minValue = result;
            	} else if (result > maxValue) {
            		maxValue = result;
            	}
            }
        }       
        
        System.out.print(minValue + " " + maxValue);
        
    }	
	
}
