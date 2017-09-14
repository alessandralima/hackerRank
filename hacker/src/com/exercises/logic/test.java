package com.exercises.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test {
	
	
	
    static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
         
        List<Drone> niceDrones = new ArrayList<>();
        List<Integer> retorno = new ArrayList<>();
        
        if (numberOfRequiredDrones > 0) {
        	
        	int maxValue =0;// drones.get(0).getFlightRange(); // get First element
        	int count = 1;
            
        	for (int i = 0 ; i < drones.size(); i++) {
        		
                if( !inMaintenanceDrones.contains(drones.get(i).getId()) )  {
                 
                    niceDrones.add(drones.get(i));

                }
        		
        	}
            
            
            for (int i=0; i < numberOfRequiredDrones; i++) {
                
                maxValue = Math.max(niceDrones.get(i).getFlightRange(), niceDrones.size());
                
            	retorno.add(niceDrones.get(i).getId());
            }
            
        }
        
        return retorno;
    }	
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfDrones = 3;
        int numberOfDronesInMaintenance = 3;
        int numberOfRequiredDrones = 3;
        
        List<Drone> drones = new ArrayList<>();
        List<Integer> inMaintenanceDrones = new ArrayList<>();

        for(int i=0; i< numberOfDrones; i++) {
            drones.add(new Drone(in.nextInt(), in.nextInt()));
        }

        for(int i=0; i< numberOfDronesInMaintenance; i++) {
            inMaintenanceDrones.add(in.nextInt());
        }
        
        List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);

        for(int i=0; i < greatestFlightRangeDrones.size(); i++) {
            System.out.println(greatestFlightRangeDrones.get(i));
        }        
        

    }
}
