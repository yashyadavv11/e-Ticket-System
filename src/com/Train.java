package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

	static List<Ticket> d = new ArrayList<>();
	
    static {
        System.out.println("============================================================================================================================================");
        System.out.println("                                                    Welcome to Indian Railways");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
    
    static String another;
    
    public static void runapp() {
    	int input;
    	do{
        System.out.println("1) Registered User");
        System.out.println("2) New User");
        System.out.println("3) To exit");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();


        switch (input) {
            case 1:
                User user1 = new NewUser("yashyadav11", "Yash@786","Yash","Surendra","Yadav","11/12/2002","India","Male",7045844095L,"Chakki Naka","Kalyan","Maharashtra",421306);
                user1.loginUser();
                break;

            case 2:
                NewUser user2 = new NewUser();
                user2.userDetails();
                user2.loginUser();
                break;

            case 3:
            	System.out.println("                                                               Exiting application");
    			System.out.println("**********************************************************************************************************************************************************");
                System.exit(0);

            default:
                System.out.println("Please enter valid input");
        }     
        }while(input<1 || input>3);
        
        //Ticket booking start from here
    	Ticket t=new Ticket();
    	t.ticketType();
    	d.add(t);
    	System.out.println("Your all booked tickets:");
    	System.out.println(d);
    	System.out.println("Do you want to book another ticket(Press Y)?");
    	Scanner sc = new Scanner(System.in);
    	another=sc.next();
    }

    public static void main(String[] args) {
        
    	runapp();
		do {
			runapp();
		}while(another.equalsIgnoreCase("Y"));
    	
    		System.out.println("                                                               Exiting application");
			System.out.println("**********************************************************************************************************************************************************");
            System.exit(0);
    	
    	
    }
}