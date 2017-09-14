package com.exercises.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConvertion {
	
	// Given a time in -hour AM/PM format, convert it to military (-hour) time
	//   Note: Midnight is  on a -hour clock, and  on a -hour clock. 
	//       Noon is  on a -hour clock, and  on a -hour clock.
    static String timeConversion(String s) {
    	String newDateFormat = "";
    	SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");
        
        try {
			newDateFormat = date24Format.format(date12Format.parse(s));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        return newDateFormat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
    
}
