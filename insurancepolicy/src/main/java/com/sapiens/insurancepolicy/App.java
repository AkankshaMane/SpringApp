package com.sapiens.insurancepolicy;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sapiens.service.Service;
import com.sapiens.service.ServiceImp;

public class App
{
    public static void main( String[] args ) throws Exception
    {
    	Service service = new ServiceImp();
    	try {
        System.out.println( "Enter your choice: " );
        System.out.println( "1 - Customer " );
		System.out.println( "2 - Policy " );
		System.out.println( "3 - Search " );
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        switch(choice) {
        case 1:
        	/* Inside Customer */
        	System.out.println( "Enter your choice: " );
    		System.out.println( "1 - Create Customer/Agent ID " );
    		System.out.println( "2 - Search by Name " );
    		System.out.println( "3 - Search by ID " );
    		int cselect = scan.nextInt();
    		switch(cselect) {
    		case 1:
    			service.acceptRecord();
    			break;
    		case 2:
    			System.out.println(service.searchByName());
    			break;
    		case 3:
    			System.out.println(service.searchById());
    			break;
    		default:
    			System.out.println( "Invalid Choice !! " );
    			break;
    		}
    		break;
        case 2:
        	/* Inside Policy */
        	System.out.println( "Please select your choice: " );
    		System.out.println( "1 - Create Policy" );
    		int pselect = scan.nextInt();
    		switch(pselect) {
      		case 1:
    			service.createPolicy();
    			break;
    		default:
    			System.out.println( "Invalid Choice !! " );
    			break;
    		}
    		break;
        }
    } catch (InputMismatchException e) {
		System.out.println("You have entered invalid data");
		}
    }
}
