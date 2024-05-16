package com;

import java.time.LocalDate;

import java.util.Scanner;

class Ticket{
	private static String name;
	private	static String bookedFrom;  
	private static String till; 
	LocalDate currentDate = LocalDate.now();
	
	Ticket(){
		this.currentDate=currentDate;
		this.name=name;
		this.bookedFrom=bookedFrom;
		this.till=till;
	}
	@Override
	public String toString() {
		return this.bookedFrom;
	}
	
	//static List<Ticket> d = new ArrayList<>();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookedFrom() {
		return this.bookedFrom;
	}

	public void setBookedFrom(String bookedFrom) {
		this.bookedFrom = bookedFrom;
	}
	
	public String getTill() {
		return till;
	}

	public void setTill(String till) {
		this.till = till;
	}

	

	public void ticketType() {
		System.out.println("Which ticket you want to book");
		System.out.println("1) Local Train Ticket");
		System.out.println("2) Express Train Ticket");
		System.out.println("3) Mono Train Ticket");
		System.out.println("4) To exit ");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			LocalTrain local=new LocalTrain();
			local.route();
			break;
		case 2:
			ExpressTrain eTrain=new ExpressTrain();
			eTrain.route();
			break;
		case 3:
			MonoRail mono=new MonoRail();
			mono.route();
			break;
		case 4:
			System.out.println("                                                               Exiting application");
			System.out.println("**********************************************************************************************************************************************************");
			System.exit(0);
		default:
            System.out.println("Please enter valid input");
		}
	}
	
	public void localTicketDetails() {
		System.out.println("======================================================================================================================================================");
    	System.out.println("====INDIAN RAILWAYS====");
    	System.out.println("*****HAPPY JOURNEY*****");
    	System.out.println("Name: " + name);
    	System.out.println("Date: " + currentDate + "    Price: 20");
    	System.out.println(bookedFrom+ " To " + till);
    	System.out.println("Adult: 1");
    	System.out.println("Journey should commence under one hour");
	}
	
	public void expressTicketDetails() {
		
        System.out.println("======================================================================================================================================================");
        System.out.println("====INDIAN RAILWAYS====");
        System.out.println("*****EXPRESS TICKET*****");
        System.out.println("Name: " + name);
        System.out.println("DOB: 11/12/2002");
        System.out.println("Date of Issue: " + currentDate + "    Price: " + 1800);
        System.out.println("From: " + bookedFrom);
        System.out.println("To: " + till);
        System.out.println("Number of Passengers: 1"); 
        }

}
