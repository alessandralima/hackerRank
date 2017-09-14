package com.exercises.logic;

import java.util.Scanner;

public class DiagonalDifference {
	
	
	// Get The primary diagonal
	static int[] sumPrimaryDiagonal(int n, int[][] myMat) {
		int sizeArray = myMat[0].length;
		int[] diagonalArray = new int[sizeArray];
		
		for (int i=0; i < n; i++) {
			for(int j=i; j <= i; j++){
				diagonalArray[j]=myMat[i][j];
			}
		}
		
		return diagonalArray;
	}
	
	// The secondary diagonal is:
	static int[] sumSecondaryDiagonal(int n, int[][] myMat) {
		int sizeArray = myMat[0].length;
		int[] secondaryDiagonal = new int[sizeArray];
		
		int position = sizeArray-1;
		for(int i=0; i < n;  i++){
			secondaryDiagonal[i]= myMat[i][position];
			position--;
		}
		
		return secondaryDiagonal;
	}
	
	// Sum values from array
	static int sumArray(int[] myArray) {
		int total=0;
        for(int i=0; i < myArray.length; i++) {
        	System.out.println(myArray[i]);
        	total+= myArray[i];
        }
        
        return total;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // constraints: elements < 100
        if (n <= 100) {
            // define matrix
            int[][] myMatrix = new int[n][n];
        
            // populate matrix
            for(int i=0; i < n; i++) {
                for(int j=0; j < myMatrix[i].length; j++) {
                	myMatrix[i][j] = in.nextInt();
                }
            }
            
            // show values in matrix
            for(int i=0; i < n; i++) {
            	for(int j=0; j < myMatrix[i].length; j++) {
            		System.out.print(myMatrix[i][j]+"\t");
            	}
            	System.out.println("");
            }
            
            // diagonal values
            int[] diagonal = sumPrimaryDiagonal(n,myMatrix);
            int sumDiag = sumArray(diagonal);
            
            // secondary values
            int[] secondary = sumSecondaryDiagonal(n, myMatrix);
            int sumSec = sumArray(secondary);
            
            // get the difference
            int total = (Math.abs(sumDiag) - Math.abs(sumSec) );
            System.out.println("without math"+ total);
            total = Math.abs(total);
            
            System.out.println("");
            System.out.println(sumDiag);
            System.out.println(sumSec);
            System.out.println(total);
            
        }
    }
}
