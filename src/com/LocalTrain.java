package com;

import java.util.Scanner;

class LocalTrain extends Ticket{
	

	public void route() {
		System.out.println("=====================================================Local Train==================================================================");
		System.out.println("Press the number according to area");
		System.out.println("1) Mumbai Local");
		System.out.println("2) Kolkata Local");
		System.out.println("3) Pune Local");
		System.out.println("4) To go back to Ticket Type");
		System.out.println("5) To exit ");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1: MumbaiLocal ticket1=new MumbaiLocal();
			    ticket1.route();
			    break;
		case 2: KolkataLocal ticket2=new KolkataLocal();
				ticket2.route();
				break;
		case 3: PuneLocal ticket3=new PuneLocal();
				ticket3.route();
				break;
		case 4: super.ticketType();
				break;
		case 5: System.out.println("                                                               Exiting application");
				System.out.println("**********************************************************************************************************************************************************");
				System.exit(0);
		default: System.out.println("Press valid input");
				System.out.println("**********************************************************************************************************************************************************");
				route();
		}

	}
	
	public void confirmation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Confirm the details:");
		System.out.println(getBookedFrom()+" Till "+getTill());
		System.out.print("Enter Y to confirm and N to change details: ");
		String confirm=sc.next();
		if(confirm.equalsIgnoreCase("Y")) {
			localTicketDetails();
		}else if(confirm.equalsIgnoreCase("N")) {
			route();
		}
	}
}
	
