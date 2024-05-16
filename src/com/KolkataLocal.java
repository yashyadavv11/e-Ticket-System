package com;

import java.util.Scanner;

class KolkataLocal extends LocalTrain{
	public void route() {
		
		System.out.println("1) North-South Line");
        System.out.println("2) East-West Line");
        System.out.println("3) Circular Line");
        System.out.println("4) To exit ");
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1:
                northSouthLine();
                break;
            case 2:
                eastWestLine();
                break;
            case 3:
                circularLine();
                break;
            case 4:
                System.out.println("Exiting application");
                System.exit(0);
            default:
                System.out.println("Press valid input");
                route();
        }
	}
	
	
	public void northSouthLine() {
		nStartPoint();
		nEndPoint();
		confirmation();
	}
	
	public void eastWestLine() {
		eStartPoint();
		eEndPoint();
		confirmation();
	}
	
	public void circularLine() {
		cStartPoint();
		cEndPoint();
		confirmation();
	}
	
	public void nStartPoint() {
		System.out.println("North-South Line Stations start point:");
        System.out.println("1) Dumdum");
        System.out.println("2) Belgachia");
        System.out.println("3) Shyambazar");
        System.out.println("4) Girish Park");
        System.out.println("5) Central");
        System.out.println("6) Park Street");
        System.out.println("7) Maidan");
        System.out.println("8) Rabindra Sadan");
        System.out.println("9) Kalighat");
        System.out.println("10) Jatin Das Park");
        System.out.println("11) Netaji Bhavan");
        System.out.println("12) Rabindra Sarobar");
        System.out.println("13) Tollygunge");

		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("Dumdum");
				break;
		case 2: setBookedFrom("Belgachia");
				break;
		case 3: setBookedFrom("Shyambazar");
				break;
		case 4: setBookedFrom("Girish Park");
				break;
		case 5: setBookedFrom("Central");
				break;
		case 6: setBookedFrom("Park Street");
				break;
		case 7: setBookedFrom("Maidan");
				break;
		case 8: setBookedFrom("Rabindra Sadan");
				break;
		case 9: setBookedFrom("Kalighat");
				break;
		case 10: setBookedFrom("Jatin Das Park");
				break;
		case 11: setBookedFrom("Netaji Bhavan");
				break;
		case 12: setBookedFrom("Rabindra Sarobar");
				break;
		case 13: setBookedFrom("Tollygunge");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void nEndPoint() {
		System.out.println("North-South Line Stations end point:");
        System.out.println("1) Dumdum");
        System.out.println("2) Belgachia");
        System.out.println("3) Shyambazar");
        System.out.println("4) Girish Park");
        System.out.println("5) Central");
        System.out.println("6) Park Street");
        System.out.println("7) Maidan");
        System.out.println("8) Rabindra Sadan");
        System.out.println("9) Kalighat");
        System.out.println("10) Jatin Das Park");
        System.out.println("11) Netaji Bhavan");
        System.out.println("12) Rabindra Sarobar");
        System.out.println("13) Tollygunge");

		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("Dumdum");
				break;
		case 2: setTill("Belgachia");
				break;
		case 3: setTill("Shyambazar");
				break;
		case 4: setTill("Girish Park");
				break;
		case 5: setTill("Central");
				break;
		case 6: setTill("Park Street");
				break;
		case 7: setTill("Maidan");
				break;
		case 8: setTill("Rabindra Sadan");
				break;
		case 9: setTill("Kalighat");
				break;
		case 10: setTill("Jatin Das Park");
				break;
		case 11: setTill("Netaji Bhavan");
				break;
		case 12: setTill("Rabindra Sarobar");
				break;
		case 13: setTill("Tollygunge");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 nEndPoint();
	}
}

	public void eStartPoint() {
		 System.out.println("East-West Line Stations end point:");
	        System.out.println("1) Howrah");
	        System.out.println("2) Shibpur");
	        System.out.println("3) Shalimar");
	        System.out.println("4) Mourigram");
	        System.out.println("5) Santragachi");
	        System.out.println("6) Ramrajatala");
	        System.out.println("7) Dasnagar");
	        System.out.println("8) Bankra");
	        System.out.println("9) Uluberia");
	        System.out.println("10) Bagnan");

		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("Howrah");
				break;
		case 2: setBookedFrom("Shibpur");
				break;
		case 3: setBookedFrom("Shalimar");
				break;
		case 4: setBookedFrom("Mourigram");
				break;
		case 5: setBookedFrom("Santragachi");
				break;
		case 6: setBookedFrom("Ramrajatala");
				break;
		case 7: setBookedFrom("Dasnagar");
				break;
		case 8: setBookedFrom("Bankra");
				break;
		case 9: setBookedFrom("Uluberia");
				break;
		case 10: setBookedFrom("Bagnan");
				break;
		
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void eEndPoint() {
		 System.out.println("East-West Line Stations end point:");
	        System.out.println("1) Howrah");
	        System.out.println("2) Shibpur");
	        System.out.println("3) Shalimar");
	        System.out.println("4) Mourigram");
	        System.out.println("5) Santragachi");
	        System.out.println("6) Ramrajatala");
	        System.out.println("7) Dasnagar");
	        System.out.println("8) Bankra");
	        System.out.println("9) Uluberia");
	        System.out.println("10) Bagnan");

		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("Howrah");
				break;
		case 2: setTill("Shibpur");
				break;
		case 3: setTill("Shalimar");
				break;
		case 4: setTill("Mourigram");
				break;
		case 5: setTill("Santragachi");
				break;
		case 6: setTill("Ramrajatala");
				break;
		case 7: setTill("Dasnagar");
				break;
		case 8: setTill("Bankra");
				break;
		case 9: setTill("Uluberia");
				break;
		case 10: setTill("Bagnan");
				break;
		
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 eEndPoint();
		}
}
	
	public void cStartPoint() {
		System.out.println("Circular Line Stations start point:");
        System.out.println("1) Esplanade");
        System.out.println("2) Chandni Chowk");
        System.out.println("3) Shyambazar");
        System.out.println("4) Belgachia");
        System.out.println("5) Bidhan Nagar");
        System.out.println("6) City Centre");
        System.out.println("7) Mahisbathan");

	
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("Esplanade");
				break;
		case 2: setBookedFrom("Chandni Chowk");
				break;
		case 3: setBookedFrom("Shyambazar");
				break;
		case 4: setBookedFrom("Belgachia");
				break;
		case 5: setBookedFrom("Bidhan Nagar");
				break;
		case 6: setBookedFrom("City Centre");
				break;
		case 7: setBookedFrom("Mahisbathan");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void cEndPoint() {
		System.out.println("Circular Line Stations end point:");
        System.out.println("1) Esplanade");
        System.out.println("2) Chandni Chowk");
        System.out.println("3) Shyambazar");
        System.out.println("4) Belgachia");
        System.out.println("5) Bidhan Nagar");
        System.out.println("6) City Centre");
        System.out.println("7) Mahisbathan");
        
	
        Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("Esplanade");
				break;
		case 2: setTill("Chandni Chowk");
				break;
		case 3: setTill("Shyambazar");
				break;
		case 4: setTill("Belgachia");
				break;
		case 5: setTill("Bidhan Nagar");
				break;
		case 6: setTill("City Centre");
				break;
		case 7: setTill("Mahisbathan");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 cEndPoint();
	
		}
}
}
	
	

