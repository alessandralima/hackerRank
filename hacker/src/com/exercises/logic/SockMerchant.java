package com.exercises.logic;

import java.util.Scanner;

public class SockMerchant {

    static boolean existsThisSock(int value, int[] newAr) {
        for(int i = 0; i < newAr.length; i++){
            if(newAr[i] == value) return true;
        }
        return false;
    }
    
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int[] result = new int[n];
        
        result[0] = ar[0];
        int position=0;
        for(int i = 1; i < n; i++){
            if (!existsThisSock(ar[i], result)){
                position++;
                result[position] = ar[i];
            }
        }        
        
        position++;
        
        return (position);   
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
