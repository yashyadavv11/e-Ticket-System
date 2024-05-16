package com;

import java.util.Scanner;

class MonoRail extends Ticket {
	
	public void endPoint() {
    	System.out.println("Select the end point");
		System.out.println("1. Chembur");
        System.out.println("2. VN Purav/RC Marg Junction");
        System.out.println("3. Fertilizer Township");
        System.out.println("4. Bharat Petroleum");
        System.out.println("5. Mysore Colony");
        System.out.println("6. Bhakti Park");
        System.out.println("7. Wadala Bridge");
        System.out.println("8. Wadala Depot");
        System.out.println("9. Anik Nagar");
        System.out.println("10. GTB Nagar");
        System.out.println("11. Antop Hill");
        System.out.println("12. Acharya Atre Nagar");
        System.out.println("13. Wadala");
        
        Scanner sc = new Scanner(System.in);
        
        int end = sc.nextInt();

        switch (end) {
            case 1:
                setTill("Chembur");
                confirmation();
                break;
            case 2:
                setTill("VN Purav/RC Marg Junction");
                confirmation();
                break;
            case 3:
                setTill("Fertilizer Township");
                confirmation();
                break;
            case 4:
                setTill("Bharat Petroleum");
                confirmation();
                break;
            case 5:
                setTill("Mysore Colony");
                confirmation();
                break;
            case 6:
                setTill("Bhakti Park");
                confirmation();
                break;
            case 7:
                setTill("Wadala Bridge");
                confirmation();
                break;
            case 8:
                setTill("Wadala Depot");
                confirmation();
                break;
            case 9:
                setTill("Anik Nagar");
                confirmation();
                break;
            case 10:
                setTill("GTB Nagar");
                confirmation();
                break;
            case 11:
                setTill("Antop Hill");
                confirmation();
                break;
            case 12:
                setTill("Acharya Atre Nagar");
                confirmation();
                break;
            case 13:
                setTill("Wadala");
                confirmation();
                break;
            default:
                System.out.println("Invalid station index");
                endPoint();
        }
    	
    }

	public void route() {
		System.out.println("=====================================================Mono Rail==================================================================");
		System.out.println("Select the start point");
		System.out.println("1. Chembur");
        System.out.println("2. VN Purav/RC Marg Junction");
        System.out.println("3. Fertilizer Township");
        System.out.println("4. Bharat Petroleum");
        System.out.println("5. Mysore Colony");
        System.out.println("6. Bhakti Park");
        System.out.println("7. Wadala Bridge");
        System.out.println("8. Wadala Depot");
        System.out.println("9. Anik Nagar");
        System.out.println("10. GTB Nagar");
        System.out.println("11. Antop Hill");
        System.out.println("12. Acharya Atre Nagar");
        System.out.println("13. Wadala");
        
        Scanner sc= new Scanner(System.in);
        int start = sc.nextInt();
        
        switch(start) {
        case 1: setBookedFrom("Chembur");
				endPoint();
        break;
        case 2: setBookedFrom("VN Purav/RC Marg Junction");
				endPoint();
        break;
        case 3: setBookedFrom("Fertilizer Township");
				endPoint();
        break;
        case 4: setBookedFrom("Bharat Petroleum");
				endPoint();
        break;
        case 5: setBookedFrom("Mysore Colony");
				endPoint();
        break;
        case 6: setBookedFrom("Bhakti Park");
				endPoint();
        break;
        case 7: setBookedFrom("Wadala Bridge");
				endPoint();
        break;
        case 8: setBookedFrom("Wadala Depot");
				endPoint();
        break;
        case 9: setBookedFrom("Anik Nagar");
				endPoint();
        break;
        case 10: setBookedFrom("GTB Nagar");
				endPoint();
         break;
        case 11: setBookedFrom("Antop Hill");
				endPoint();
         break;
        case 12: setBookedFrom("Acharya Atre Nagar");
				endPoint();
         break;
        case 13: setBookedFrom("Wadala");
				endPoint();
         break;
        default: System.out.println("Invalid station index");
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
