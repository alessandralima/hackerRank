package com.exercises.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        //The test cases are scaled to six decimal places
        DecimalFormat dec = new DecimalFormat("#0.000000");
        
        double positiveValue = 0d;
        double negativeValue = 0d;
        double zeroes = 0;
        
        for(int i=0; i < n; i++) {
        	//A decimal representing of the fraction of positive numbers in the array compared to its size.
        	if (ar[i] > 0) {
        		positiveValue++;
        	} 
        	//A decimal representing of the fraction of negative numbers in the array compared to its size.
        	else if (ar[i] < 0) {
        		negativeValue++;
        	} 
        	//A decimal representing of the fraction of zeroes in the array compared to its size.
        	else if (ar[i] == 0) {
        		zeroes++;
        	}
        }
        double total = 0;
        
        total = positiveValue/n;
        if (total >0) {
            System.out.println( dec.format(total));
        }
        
        total = negativeValue/n;
        if (total > 0) {
        	System.out.println( dec.format(total));
        }
        
        total = zeroes/n;
        if (total > 0) {
        	System.out.println( dec.format(total));
        }
        

    }
}
