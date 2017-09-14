package com.exercises.logic;

import java.util.Scanner;

public class BreakingRecords {


    static int[] getRecord(int[] s){
        int[] result = new int[2];
        int minValue = s[0];
        int maxValue = s[0];
        int countMax=0;
        int countMin=0;
        
        for(int i=1; i < s.length; i++) {
            if(s[i] < minValue) {
                minValue = s[i];
                countMin++;
            }
            if(s[i] > maxValue) {
                maxValue = s[i];
                countMax++;
            }
        }
        
        result[0] = countMax;
        result[1] = countMin;
        
        return result;
          
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
