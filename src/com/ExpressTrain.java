package com;

import java.util.Scanner;

class ExpressTrain extends Ticket{

	public void route() {
		System.out.println("Enter the input according to type of route");
		System.out.println("1) North to South");
		System.out.println("2) South to North");
		System.out.println("3) East to West");
		System.out.println("4) West to East");
		System.out.println("5) To return to ticket type");
		System.out.println("6) To exit");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		switch(input) {
		case 1: nsStart();
				nsEnd();
				confirmation();
				break;
		case 2: snStart();
				snEnd();
				confirmation();
				break;
		case 3: ewStart();
				ewEnd();
				confirmation();
				break;
		case 4: weStart();
				weEnd();
				confirmation();
				break;
				
		case 5: ticketType();
				break;
				
		case 6: System.out.println("                                                               Exiting application");
				System.out.println("**********************************************************************************************************************************************************");
				System.exit(0);
		
		default: System.out.println("Press valid input");
				System.out.println("**********************************************************************************************************************************************************");
				route();
		}
	}
	
	public void nsStart() {
		System.out.println("Select from which railway station you want to book");
		System.out.println("1. Jammu Tawi (Jammu and Kashmir)");
		System.out.println("2. New Delhi (Delhi)");
		System.out.println("3. Lucknow Charbagh (Uttar Pradesh)");
		System.out.println("4. Kanpur Central (Uttar Pradesh)");
		System.out.println("5. Allahabad Junction (Uttar Pradesh)");
		System.out.println("6. Patna Junction (Bihar)");
		System.out.println("7. Howrah Junction (West Bengal)");
		System.out.println("8. Ranchi Junction (Jharkhand)");
		System.out.println("9. Bhubaneswar (Odisha)");
		System.out.println("10. Visakhapatnam Junction (Andhra Pradesh)");
		System.out.println("11. Vijayawada Junction (Andhra Pradesh)");
		System.out.println("12. Chennai Central (Tamil Nadu)");
		System.out.println("13. Coimbatore Junction (Tamil Nadu)");
		System.out.println("14. Ernakulam Junction (Kerala)");
		System.out.println("15. Thiruvananthapuram Central (Kerala)");
		System.out.println("16. To exit ");
		System.out.println("17. To return to route");
		
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		
		switch(start) {
			case 1: setBookedFrom("Jammu Tawi (Jammu and Kashmir)");
		        	break;
			case 2: setBookedFrom("New Delhi (Delhi)");
		        	break;
		    case 3: setBookedFrom("Lucknow Charbagh (Uttar Pradesh)");
		        	break;
		    case 4: setBookedFrom("Kanpur Central (Uttar Pradesh)");
		        	break;
		    case 5: setBookedFrom("Allahabad Junction (Uttar Pradesh)");
		        	break;
		    case 6: setBookedFrom("Patna Junction (Bihar)");
		        	break;
		    case 7: setBookedFrom("Howrah Junction (West Bengal)");
		        	break;
		    case 8: setBookedFrom("Ranchi Junction (Jharkhand)");
		        	break;
		    case 9: setBookedFrom("Bhubaneswar (Odisha)");
		        	break;
		    case 10: setBookedFrom("Visakhapatnam Junction (Andhra Pradesh)");
		        	break;
		    case 11: setBookedFrom("Vijayawada Junction (Andhra Pradesh)");
		        	break;
		    case 12: setBookedFrom("Chennai Central (Tamil Nadu)");
		        	break;
		    case 13: setBookedFrom("Coimbatore Junction (Tamil Nadu)");
		        	break;
		    case 14: setBookedFrom("Ernakulam Junction (Kerala)");
		        	break;
		    case 15: setBookedFrom("Thiruvananthapuram Central (Kerala)");
		        	break;
		    case 16: System.out.println("                                                               Exiting application");
					 System.out.println("**********************************************************************************************************************************************************");
					 System.exit(0);
		    case 17: route();
		    		break;
		    default:
		        System.out.println("Press valid input");
		        System.out.println("**********************************************************************************************************************************************************");
		        route();
		}
		
	}
	
	public void nsEnd() {
	    System.out.println("Select till which railway station you want to book:");
	    System.out.println("1. Jammu Tawi (Jammu and Kashmir)");
	    System.out.println("2. New Delhi (Delhi)");
	    System.out.println("3. Lucknow Charbagh (Uttar Pradesh)");
	    System.out.println("4. Kanpur Central (Uttar Pradesh)");
	    System.out.println("5. Allahabad Junction (Uttar Pradesh)");
	    System.out.println("6. Patna Junction (Bihar)");
	    System.out.println("7. Howrah Junction (West Bengal)");
	    System.out.println("8. Ranchi Junction (Jharkhand)");
	    System.out.println("9. Bhubaneswar (Odisha)");
	    System.out.println("10. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("11. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("12. Chennai Central (Tamil Nadu)");
	    System.out.println("13. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("14. Ernakulam Junction (Kerala)");
	    System.out.println("15. Thiruvananthapuram Central (Kerala)");
	    System.out.println("16. To exit ");
	    System.out.println("17. To return to end destination");

	    Scanner sc = new Scanner(System.in);
	    int end = sc.nextInt();

	    switch (end) {
	        case 1:
	            setTill("Jammu Tawi (Jammu and Kashmir)");
	            break;
	        case 2:
	            setTill("New Delhi (Delhi)");
	            break;
	        case 3:
	            setTill("Lucknow Charbagh (Uttar Pradesh)");
	            break;
	        case 4:
	            setTill("Kanpur Central (Uttar Pradesh)");
	            break;
	        case 5:
	            setTill("Allahabad Junction (Uttar Pradesh)");
	            break;
	        case 6:
	            setTill("Patna Junction (Bihar)");
	            break;
	        case 7:
	            setTill("Howrah Junction (West Bengal)");
	            break;
	        case 8:
	            setTill("Ranchi Junction (Jharkhand)");
	            break;
	        case 9:
	            setTill("Bhubaneswar (Odisha)");
	            break;
	        case 10:
	            setTill("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 11:
	            setTill("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 12:
	            setTill("Chennai Central (Tamil Nadu)");
	            break;
	        case 13:
	            setTill("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 14:
	            setTill("Ernakulam Junction (Kerala)");
	            break;
	        case 15:
	            setTill("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        case 17:
	            nsEnd();
	            break;
	        default:
	            System.out.println("Press valid input");
	            System.out.println("**********************************************************************************************************************************************************");
	            route();
	    }
	}

	public void snStart() {
	    System.out.println("Select from which railway station you want to book:");
	    System.out.println("1. Thiruvananthapuram Central (Kerala)");
	    System.out.println("2. Ernakulam Junction (Kerala)");
	    System.out.println("3. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("4. Chennai Central (Tamil Nadu)");
	    System.out.println("5. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("6. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("7. Bhubaneswar (Odisha)");
	    System.out.println("8. Ranchi Junction (Jharkhand)");
	    System.out.println("9. Howrah Junction (West Bengal)");
	    System.out.println("10. Patna Junction (Bihar)");
	    System.out.println("11. Allahabad Junction (Uttar Pradesh)");
	    System.out.println("12. Kanpur Central (Uttar Pradesh)");
	    System.out.println("13. Lucknow Charbagh (Uttar Pradesh)");
	    System.out.println("14. New Delhi (Delhi)");
	    System.out.println("15. Jammu Tawi (Jammu and Kashmir)");
	    System.out.println("16. To exit ");

	    Scanner sc = new Scanner(System.in);
	    int start = sc.nextInt();

	    switch (start) {
	        case 1:
	            setBookedFrom("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 2:
	            setBookedFrom("Ernakulam Junction (Kerala)");
	            break;
	        case 3:
	            setBookedFrom("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 4:
	            setBookedFrom("Chennai Central (Tamil Nadu)");
	            break;
	        case 5:
	            setBookedFrom("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 6:
	            setBookedFrom("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 7:
	            setBookedFrom("Bhubaneswar (Odisha)");
	            break;
	        case 8:
	            setBookedFrom("Ranchi Junction (Jharkhand)");
	            break;
	        case 9:
	            setBookedFrom("Howrah Junction (West Bengal)");
	            break;
	        case 10:
	            setBookedFrom("Patna Junction (Bihar)");
	            break;
	        case 11:
	            setBookedFrom("Allahabad Junction (Uttar Pradesh)");
	            break;
	        case 12:
	            setBookedFrom("Kanpur Central (Uttar Pradesh)");
	            break;
	        case 13:
	            setBookedFrom("Lucknow Charbagh (Uttar Pradesh)");
	            break;
	        case 14:
	            setBookedFrom("New Delhi (Delhi)");
	            break;
	        case 15:
	            setBookedFrom("Jammu Tawi (Jammu and Kashmir)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        default:
	            System.out.println("Press valid input");
	            System.out.println("**********************************************************************************************************************************************************");
	            route();
	    }
	}
	
	public void snEnd() {
	    System.out.println("Select till which railway station you want to book:");
	    System.out.println("1. Thiruvananthapuram Central (Kerala)");
	    System.out.println("2. Ernakulam Junction (Kerala)");
	    System.out.println("3. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("4. Chennai Central (Tamil Nadu)");
	    System.out.println("5. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("6. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("7. Bhubaneswar (Odisha)");
	    System.out.println("8. Ranchi Junction (Jharkhand)");
	    System.out.println("9. Howrah Junction (West Bengal)");
	    System.out.println("10. Patna Junction (Bihar)");
	    System.out.println("11. Allahabad Junction (Uttar Pradesh)");
	    System.out.println("12. Kanpur Central (Uttar Pradesh)");
	    System.out.println("13. Lucknow Charbagh (Uttar Pradesh)");
	    System.out.println("14. New Delhi (Delhi)");
	    System.out.println("15. Jammu Tawi (Jammu and Kashmir)");
	    System.out.println("16. To exit ");
	    System.out.println("17. To return to end destination");

	    Scanner sc = new Scanner(System.in);
	    int end = sc.nextInt();

	    switch (end) {
	        case 1:
	            setTill("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 2:
	            setTill("Ernakulam Junction (Kerala)");
	            break;
	        case 3:
	            setTill("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 4:
	            setTill("Chennai Central (Tamil Nadu)");
	            break;
	        case 5:
	            setTill("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 6:
	            setTill("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 7:
	            setTill("Bhubaneswar (Odisha)");
	            break;
	        case 8:
	            setTill("Ranchi Junction (Jharkhand)");
	            break;
	        case 9:
	            setTill("Howrah Junction (West Bengal)");
	            break;
	        case 10:
	            setTill("Patna Junction (Bihar)");
	            break;
	        case 11:
	            setTill("Allahabad Junction (Uttar Pradesh)");
	            break;
	        case 12:
	            setTill("Kanpur Central (Uttar Pradesh)");
	            break;
	        case 13:
	            setTill("Lucknow Charbagh (Uttar Pradesh)");
	            break;
	        case 14:
	            setTill("New Delhi (Delhi)");
	            break;
	        case 15:
	            setTill("Jammu Tawi (Jammu and Kashmir)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        case 17:
	            snEnd();
	            break;
	        default:
	            System.out.println("Press valid input");
	            System.out.println("**********************************************************************************************************************************************************");
	            route();
	    }
	}

	public void ewStart() {
	    System.out.println("Select from which railway station you want to book:");
	    System.out.println("1. Howrah Junction (West Bengal)");
	    System.out.println("2. Ranchi Junction (Jharkhand)");
	    System.out.println("3. Bhubaneswar (Odisha)");
	    System.out.println("4. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("5. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("6. Chennai Central (Tamil Nadu)");
	    System.out.println("7. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("8. Ernakulam Junction (Kerala)");
	    System.out.println("9. Thiruvananthapuram Central (Kerala)");
	    System.out.println("10. Panvel Junction (Maharashtra)");
	    System.out.println("11. Pune Junction (Maharashtra)");
	    System.out.println("12. Mumbai CST (Maharashtra)");
	    System.out.println("13. Vadodara Junction (Gujarat)");
	    System.out.println("14. Ahmedabad Junction (Gujarat)");
	    System.out.println("15. Surat (Gujarat)");
	    System.out.println("16. To exit ");

	    Scanner sc = new Scanner(System.in);
	    int start = sc.nextInt();

	    switch (start) {
	        case 1:
	            setBookedFrom("Howrah Junction (West Bengal)");
	            break;
	        case 2:
	            setBookedFrom("Ranchi Junction (Jharkhand)");
	            break;
	        case 3:
	            setBookedFrom("Bhubaneswar (Odisha)");
	            break;
	        case 4:
	            setBookedFrom("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 5:
	            setBookedFrom("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 6:
	            setBookedFrom("Chennai Central (Tamil Nadu)");
	            break;
	        case 7:
	            setBookedFrom("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 8:
	            setBookedFrom("Ernakulam Junction (Kerala)");
	            break;
	        case 9:
	            setBookedFrom("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 10:
	            setBookedFrom("Panvel Junction (Maharashtra)");
	            break;
	        case 11:
	            setBookedFrom("Pune Junction (Maharashtra)");
	            break;
	        case 12:
	            setBookedFrom("Mumbai CST (Maharashtra)");
	            break;
	        case 13:
	            setBookedFrom("Vadodara Junction (Gujarat)");
	            break;
	        case 14:
	            setBookedFrom("Ahmedabad Junction (Gujarat)");
	            break;
	        case 15:
	            setBookedFrom("Surat (Gujarat)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        default:
	            System.out.println("Press valid input");
	            System.out.println("**********************************************************************************************************************************************************");
	            route();
	    }
	}

	public void ewEnd() {
	    System.out.println("Select till which railway station you want to book:");
	    System.out.println("1. Howrah Junction (West Bengal)");
	    System.out.println("2. Ranchi Junction (Jharkhand)");
	    System.out.println("3. Bhubaneswar (Odisha)");
	    System.out.println("4. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("5. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("6. Chennai Central (Tamil Nadu)");
	    System.out.println("7. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("8. Ernakulam Junction (Kerala)");
	    System.out.println("9. Thiruvananthapuram Central (Kerala)");
	    System.out.println("10. Panvel Junction (Maharashtra)");
	    System.out.println("11. Pune Junction (Maharashtra)");
	    System.out.println("12. Mumbai CST (Maharashtra)");
	    System.out.println("13. Vadodara Junction (Gujarat)");
	    System.out.println("14. Ahmedabad Junction (Gujarat)");
	    System.out.println("15. Surat (Gujarat)");
	    System.out.println("16. To exit ");
	    System.out.println("17. To return to end destination");

	    Scanner sc = new Scanner(System.in);
	    int end = sc.nextInt();

	    switch (end) {
	        case 1:
	            setTill("Howrah Junction (West Bengal)");
	            break;
	        case 2:
	            setTill("Ranchi Junction (Jharkhand)");
	            break;
	        case 3:
	            setTill("Bhubaneswar (Odisha)");
	            break;
	        case 4:
	            setTill("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 5:
	            setTill("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 6:
	            setTill("Chennai Central (Tamil Nadu)");
	            break;
	        case 7:
	            setTill("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 8:
	            setTill("Ernakulam Junction (Kerala)");
	            break;
	        case 9:
	            setTill("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 10:
	            setTill("Panvel Junction (Maharashtra)");
	            break;
	        case 11:
	            setTill("Pune Junction (Maharashtra)");
	            break;
	        case 12:
	            setTill("Mumbai CST (Maharashtra)");
	            break;
	        case 13:
	            setTill("Vadodara Junction (Gujarat)");
	            break;
	        case 14:
	            setTill("Ahmedabad Junction (Gujarat)");
	            break;
	        case 15:
	            setTill("Surat (Gujarat)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        case 17:
	            ewEnd();
	            break;
	        default:
	            System.out.println("Press valid input");
	            System.out.println("**********************************************************************************************************************************************************");
	            route();
	    }
	}

	public void weStart() {
	    System.out.println("Select from which railway station you want to book:");
	    System.out.println("1. Surat (Gujarat)");
	    System.out.println("2. Ahmedabad Junction (Gujarat)");
	    System.out.println("3. Vadodara Junction (Gujarat)");
	    System.out.println("4. Mumbai CST (Maharashtra)");
	    System.out.println("5. Pune Junction (Maharashtra)");
	    System.out.println("6. Panvel Junction (Maharashtra)");
	    System.out.println("7. Thiruvananthapuram Central (Kerala)");
	    System.out.println("8. Ernakulam Junction (Kerala)");
	    System.out.println("9. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("10. Chennai Central (Tamil Nadu)");
	    System.out.println("11. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("12. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("13. Bhubaneswar (Odisha)");
	    System.out.println("14. Ranchi Junction (Jharkhand)");
	    System.out.println("15. Howrah Junction (West Bengal)");
	    System.out.println("16. To exit ");

	    Scanner sc = new Scanner(System.in);
	    int start = sc.nextInt();

	    switch (start) {
	        case 1:
	            setBookedFrom("Surat (Gujarat)");
	            break;
	        case 2:
	            setBookedFrom("Ahmedabad Junction (Gujarat)");
	            break;
	        case 3:
	            setBookedFrom("Vadodara Junction (Gujarat)");
	            break;
	        case 4:
	            setBookedFrom("Mumbai CST (Maharashtra)");
	            break;
	        case 5:
	            setBookedFrom("Pune Junction (Maharashtra)");
	            break;
	        case 6:
	            setBookedFrom("Panvel Junction (Maharashtra)");
	            break;
	        case 7:
	            setBookedFrom("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 8:
	            setBookedFrom("Ernakulam Junction (Kerala)");
	            break;
	        case 9:
	            setBookedFrom("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 10:
	            setBookedFrom("Chennai Central (Tamil Nadu)");
	            break;
	        case 11:
	            setBookedFrom("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 12:
	            setBookedFrom("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 13:
	            setBookedFrom("Bhubaneswar (Odisha)");
	            break;
	        case 14:
	            setBookedFrom("Ranchi Junction (Jharkhand)");
	            break;
	        case 15:
	            setBookedFrom("Howrah Junction (West Bengal)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        default:
	            System.out.println("Press valid input");
	            System.out.println("**********************************************************************************************************************************************************");
	            route();
	    }
	}

	public void weEnd() {
	    System.out.println("Select till which railway station you want to book:");
	    System.out.println("1. Surat (Gujarat)");
	    System.out.println("2. Ahmedabad Junction (Gujarat)");
	    System.out.println("3. Vadodara Junction (Gujarat)");
	    System.out.println("4. Mumbai CST (Maharashtra)");
	    System.out.println("5. Pune Junction (Maharashtra)");
	    System.out.println("6. Panvel Junction (Maharashtra)");
	    System.out.println("7. Thiruvananthapuram Central (Kerala)");
	    System.out.println("8. Ernakulam Junction (Kerala)");
	    System.out.println("9. Coimbatore Junction (Tamil Nadu)");
	    System.out.println("10. Chennai Central (Tamil Nadu)");
	    System.out.println("11. Vijayawada Junction (Andhra Pradesh)");
	    System.out.println("12. Visakhapatnam Junction (Andhra Pradesh)");
	    System.out.println("13. Bhubaneswar (Odisha)");
	    System.out.println("14. Ranchi Junction (Jharkhand)");
	    System.out.println("15. Howrah Junction (West Bengal)");
	    System.out.println("16. To exit ");
	    System.out.println("17. To return to end destination");

	    Scanner sc = new Scanner(System.in);
	    int end = sc.nextInt();

	    switch (end) {
	        case 1:
	            setTill("Surat (Gujarat)");
	            break;
	        case 2:
	            setTill("Ahmedabad Junction (Gujarat)");
	            break;
	        case 3:
	            setTill("Vadodara Junction (Gujarat)");
	            break;
	        case 4:
	            setTill("Mumbai CST (Maharashtra)");
	            break;
	        case 5:
	            setTill("Pune Junction (Maharashtra)");
	            break;
	        case 6:
	            setTill("Panvel Junction (Maharashtra)");
	            break;
	        case 7:
	            setTill("Thiruvananthapuram Central (Kerala)");
	            break;
	        case 8:
	            setTill("Ernakulam Junction (Kerala)");
	            break;
	        case 9:
	            setTill("Coimbatore Junction (Tamil Nadu)");
	            break;
	        case 10:
	            setTill("Chennai Central (Tamil Nadu)");
	            break;
	        case 11:
	            setTill("Vijayawada Junction (Andhra Pradesh)");
	            break;
	        case 12:
	            setTill("Visakhapatnam Junction (Andhra Pradesh)");
	            break;
	        case 13:
	            setTill("Bhubaneswar (Odisha)");
	            break;
	        case 14:
	            setTill("Ranchi Junction (Jharkhand)");
	            break;
	        case 15:
	            setTill("Howrah Junction (West Bengal)");
	            break;
	        case 16:
	            System.out.println("Exiting application");
	            System.out.println("**********************************************************************************************************************************************************");
	            System.exit(0);
	        case 17:
	            weEnd();
	            break;
	        default:
	            System.out.println("Press valid input");
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
			expressTicketDetails();
		}else if(confirm.equalsIgnoreCase("N")) {
			route();
		}
	}

}
