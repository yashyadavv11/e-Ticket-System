package com;

import java.util.Scanner;

class MumbaiLocal extends LocalTrain{
	public void route() {
		
		System.out.println("1) Central Line");
		System.out.println("2) Western Line");
		System.out.println("3) Harbour Line");
		System.out.println("4) TransHarbour Line");
		System.out.println("5) To exit ");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n) {
		case 1: centralLine();	
				break;
		case 2: westernLine();
				break;
		case 3: harbourLine();
				break;
		case 4:	transHarbourLine();
				break;
		case 5: System.out.println("                                                               Exiting application");
			    System.out.println("**********************************************************************************************************************************************************");
			    System.exit(0);
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	
	public void centralLine() {
		cStartPoint();
		cEndPoint();
		confirmation();
	}
	
	public void westernLine() {
		wStartPoint();
		wEndPoint();
		confirmation();
	}
	
	public void harbourLine() {
		hStartPoint();
		hEndPoint();
		confirmation();
	}
	
	public void transHarbourLine() {
		tStartPoint();
		tEndPoint();
		confirmation();
	}


	public void cStartPoint() {
		System.out.println("Select start point");
		System.out.println("1) CSMT");	
		System.out.println("2) Byculla");	
		System.out.println("3) Dadar");	
		System.out.println("4) Kurla");	
		System.out.println("5) Ghatkopar");	
		System.out.println("6) Mulund");	
		System.out.println("7) Thane");	
		System.out.println("8) Diva");	
		System.out.println("9) Dombivali");	
		System.out.println("10) Kalyan");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("CSMT");
				break;
		case 2: setBookedFrom("Byculla");
				break;
		case 3: setBookedFrom("Dadar");
				break;
		case 4: setBookedFrom("Kurla");
				break;
		case 5: setBookedFrom("Ghatkopar");
				break;
		case 6: setBookedFrom("Mulund");
				break;
		case 7: setBookedFrom("Thane");
				break;
		case 8: setBookedFrom("Diva");
				break;
		case 9: setBookedFrom("Dombivali");
				break;
		case 10: setBookedFrom("Kalyan");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void cEndPoint() {
		System.out.println("Select end point");
		System.out.println("1) CSMT");	
		System.out.println("2) Byculla");	
		System.out.println("3) Dadar");	
		System.out.println("4) Kurla");	
		System.out.println("5) Ghatkopar");	
		System.out.println("6) Mulund");	
		System.out.println("7) Thane");	
		System.out.println("8) Diva");	
		System.out.println("9) Dombivali");	
		System.out.println("10) Kalyan");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		switch(end) {
		case 1: setTill("CSMT");
		break;
		case 2: setTill("Byculla");
		break;
		case 3: setTill("Dadar");
		break;
		case 4: setTill("Kurla");
		break;
		case 5: setTill("Ghatkopar");
		break;
		case 6: setTill("Mulund");
		break;
		case 7: setTill("Thane");
		break;
		case 8: setTill("Diva");
		break;
		case 9: setTill("Dombivali");
		break;
		case 10: setTill("Kalyan");
		break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 cEndPoint();
		
	}
}

	public void wStartPoint() {
		System.out.println("Select start point");
		System.out.println("1) Churchgate");	
		System.out.println("2) Mumbai Central");	
		System.out.println("3) Dadar");	
		System.out.println("4) Bandra");	
		System.out.println("5) Andheri");	
		System.out.println("6) Goregaon");	
		System.out.println("7) Borivali");	
		System.out.println("8) Bhayander");	
		System.out.println("9) Vasai Road");	
		System.out.println("10) Virar");
		System.out.println("11) Dahanu Road");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("Churchgate");
			    break;
		case 2: setBookedFrom("Mumbai Central");
				break;
		case 3: setBookedFrom("Dadar");
				break;
		case 4: setBookedFrom("Bandra");
				break;
		case 5: setBookedFrom("Andheri");
				break;
		case 6: setBookedFrom("Goregaon");
				break;
		case 7: setBookedFrom("Borivali");
				break;
		case 8: setBookedFrom("Bhayander");
				break;
		case 9: setBookedFrom("Vasai Road");
				break;
		case 10: setBookedFrom("Virar");
				 break;
		case 11: setBookedFrom("Dahanu Road");
				 break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void wEndPoint() {
		System.out.println("Select end point");
		System.out.println("1) Churchgate");	
		System.out.println("2) Mumbai Central");	
		System.out.println("3) Dadar");	
		System.out.println("4) Bandra");	
		System.out.println("5) Andheri");	
		System.out.println("6) Goregaon");	
		System.out.println("7) Borivali");	
		System.out.println("8) Bhayander");	
		System.out.println("9) Vasai Road");	
		System.out.println("10) Virar");
		System.out.println("11) Dahanu Road");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("Churchgate");
				break;
		case 2: setTill("Mumbai Central");
				break;
		case 3: setTill("Dadar");
				break;
		case 4: setTill("Bandra");
				break;
		case 5: setTill("Andheri");
				break;
		case 6: setTill("Goregaon");
				break;
		case 7: setTill("Borivali");
				break;
		case 8: setTill("Bhayander");
				break;
		case 9: setTill("Vasai Road");
				break;
		case 10: setTill("Virar");
				break;
		case 11: setTill("Dahanu Road");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 wEndPoint();
		}
	}
	
	public void hStartPoint() {
		System.out.println("Select start point");
		System.out.println("1) CSMT");	
		System.out.println("2) Masjid");	
		System.out.println("3) Sandhurst Road");	
		System.out.println("4) Dockyard Road");	
		System.out.println("5) Reay Road");	
		System.out.println("6) Cotton Green");	
		System.out.println("7) Sewri");	
		System.out.println("8) Vadala Road");	
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("CSMT");
				break;
		case 2: setBookedFrom("Masjid");
				break;
		case 3: setBookedFrom("Sandhurst Road");
				break;
		case 4: setBookedFrom("Dockyard Road");
				break;
		case 5: setBookedFrom("Reay Road");
				break;
		case 6: setBookedFrom("Cotton Green");
				break;
		case 7: setBookedFrom("Sewri");
				break;
		case 8: setBookedFrom("Vadala Road");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void hEndPoint() {
		System.out.println("Select end point");
		System.out.println("1) CSMT");	
		System.out.println("2) Masjid");	
		System.out.println("3) Sandhurst Road");	
		System.out.println("4) Dockyard Road");	
		System.out.println("5) Reay Road");	
		System.out.println("6) Cotton Green");	
		System.out.println("7) Sewri");	
		System.out.println("8) Vadala Road");	
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("CSMT");
				break;
		case 2: setTill("Masjid");
				break;
		case 3: setTill("Sandhurst Road");
				break;
		case 4: setTill("Dockyard Road");
				break;
		case 5: setTill("Reay Road");
				break;
		case 6: setTill("Cotton Green");
				break;
		case 7: setTill("Sewri");
				break;
		case 8: setTill("Vadala Road");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 hEndPoint();
		}
	}
	
	public void tStartPoint() {
		System.out.println("Select start point");
		System.out.println("1) Thane");	
		System.out.println("2) Digha Gaon");	
		System.out.println("3) Airoli");	
		System.out.println("4) Rabale");	
		System.out.println("5) Ghansoli");	
		System.out.println("6) Kopar Khairane");	
		System.out.println("7) Turbhe");	
		System.out.println("8) Sanpada");	
		System.out.println("9) Vashi");	
		System.out.println("10) Nerul");
		System.out.println("11) Kharghar");
		System.out.println("12) Panvel");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
		case 1: setBookedFrom("Thane");
				break;
		case 2: setBookedFrom("Digha Gaon");
				break;
		case 3: setBookedFrom("Airoli");
				break;
		case 4: setBookedFrom("Rabale");
				break;
		case 5: setBookedFrom("Ghansoli");
				break;
		case 6: setBookedFrom("Kopar Khairane");
				break;
		case 7: setBookedFrom("Turbhe");
				break;
		case 8: setBookedFrom("Sanpada");
				break;
		case 9: setBookedFrom("Vashi");
				break;
		case 10: setBookedFrom("Nerul");
				break;
		case 11: setBookedFrom("Kharghar");
				break;
		case 12: setBookedFrom("Panvel");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 route();
		}
	}
	
	public void tEndPoint() {
		System.out.println("Select end point");
		System.out.println("1) Thane");	
		System.out.println("2) Digha Gaon");	
		System.out.println("3) Airoli");	
		System.out.println("4) Rabale");	
		System.out.println("5) Ghansoli");	
		System.out.println("6) Kopar Khairane");	
		System.out.println("7) Turbhe");	
		System.out.println("8) Sanpada");	
		System.out.println("9) Vashi");	
		System.out.println("10) Nerul");
		System.out.println("11) Kharghar");
		System.out.println("12) Panvel");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		
		switch(end) {
		case 1: setTill("Thane");
				break;
		case 2: setTill("Digha Gaon");
				break;
		case 3: setTill("Airoli");
				break;
		case 4: setTill("Rabale");
				break;
		case 5: setTill("Ghansoli");
				break;
		case 6: setTill("Kopar Khairane");
				break;
		case 7: setTill("Turbhe");
				break;
		case 8: setTill("Sanpada");
				break;
		case 9: setTill("Vashi");
				break;
		case 10: setTill("Nerul");
				break;
		case 11: setTill("Kharghar");
				break;
		case 12: setTill("Panvel");
				break;
		default: System.out.println("Press valid input");
				 System.out.println("**********************************************************************************************************************************************************");
				 tEndPoint();
		}
	}

}
