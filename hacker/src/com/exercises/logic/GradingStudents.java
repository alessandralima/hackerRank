package com.exercises.logic;

import java.util.Scanner;

public class GradingStudents {
	
	
    static int[] solve(int[] grades){
        
        int[] newGrade = new int[grades.length];
        
        for(int grades_i=0; grades_i < grades.length; grades_i++){
            
        	// the grade will not be modified and the student's final grade is the same.
            // the grade will not be modified and the student's final grade is the same            
            if (grades[grades_i] < 38 || grades[grades_i] % 5 < 3) {
                newGrade[grades_i] = grades[grades_i];
            } else {
        	   // the student's grade is rounded to up
                // the student's grade will be rounded to up.                      
            	//System.out.println(grades[grades_i] + " +" + (grades[grades_i] % 5) + " "+ (5 - (grades[grades_i] % 5)));
                newGrade[grades_i] = grades[grades_i] + (5 - (grades[grades_i] % 5));
                //System.out.println( newGrade[grades_i]);

            }
                
        }        
        
        return newGrade;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
