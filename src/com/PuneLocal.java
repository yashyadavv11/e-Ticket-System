package com;

import java.util.Scanner;

class PuneLocal extends LocalTrain{
	public void route() {
		startPoint();
		endPoint();
		confirmation();
	}
	
	public void startPoint() {
		System.out.println("**WELCOME TO PUNE LOCAL**");
		System.out.println("Select the start point");
		System.out.println("1) Pune");
		System.out.println("2) Shivaji Nagar");
		System.out.println("3) Khadaki");
		System.out.println("4) Dapodi");
		System.out.println("5) Pimpri");
		System.out.println("6) Chincwad");
		System.out.println("7) Akurdi");
		System.out.println("8) Talegaon");
		System.out.println("9) Kamshet");
		System.out.println("10) Lonavala");
		System.out.println("11) To exit");
		
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("Pune");
				break;
		case 2: setBookedFrom("Shivaji Nagar");
				break;
		case 3: setBookedFrom("Khadaki");
				break;
		case 4: setBookedFrom("Dapodi");
				break;
		case 5: setBookedFrom("Pimpri");
				break;
		case 6: setBookedFrom("Chincwad");
				break;
		case 7: setBookedFrom("Akurdi");
				break;
		case 8: setBookedFrom("Talegaon");
				break;
		case 9: setBookedFrom("Kamshet");
				break;
		case 10: setBookedFrom("Lonavala");
				break;
		case 11: System.out.println("                                                               Exiting application");
				 System.out.println("**********************************************************************************************************************************************************");
				 System.exit(0);
		default:System.err.println("Press valid input");
				startPoint();
		}
	}
	public void endPoint() {
		System.out.println("Select the end point");
		System.out.println("1) Pune");
		System.out.println("2) Shivaji Nagar");
		System.out.println("3) Khadaki");
		System.out.println("4) Dapodi");
		System.out.println("5) Pimpri");
		System.out.println("6) Chincwad");
		System.out.println("7) Akurdi");
		System.out.println("8) Talegaon");
		System.out.println("9) Kamshet");
		System.out.println("10) Lonavala");
		System.out.println("11) To exit");
		
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("Pune");
				break;
		case 2: setTill("Shivaji Nagar");
				break;
		case 3: setTill("Khadaki");
				break;
		case 4: setTill("Dapodi");
				break;
		case 5: setTill("Pimpri");
				break;
		case 6: setTill("Chincwad");
				break;
		case 7: setTill("Akurdi");
				break;
		case 8: setTill("Talegaon");
				break;
		case 9: setTill("Kamshet");
				break;
		case 10: setTill("Lonavala");
				break;
		case 11: System.out.println("                                                               Exiting application");
				 System.out.println("**********************************************************************************************************************************************************");
				 System.exit(0);
		default:System.err.println("Press valid input");
				endPoint();
		}
	}
}
