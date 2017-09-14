package com.exercises.logic;

import java.util.Scanner;

public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int n, int[] ar) {
		int total = 0;
		int current = 0;
		int maxValue = 0;
		
		for(int i = 0; i < n; i++) {
			current= ar[i];
            
            if(i==0) maxValue = current;
			
			if (current >= maxValue) {
				//the taller candles tower over the shorter ones
				if (current != maxValue) {
					total=0;
				}
                maxValue = current;
				total++;
			}
			
			
        }
		
		return total;
    }
		
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles (n, ar);
        
        System.out.println(result);
    }
}
