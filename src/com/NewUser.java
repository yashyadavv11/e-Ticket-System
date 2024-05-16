package com;

import java.util.Scanner;

class NewUser extends RegisteredUser {
	
	NewUser(){
		
	}
    private String fName;
    private String mName;
    private String lName;
    private String dob;
    private String nation;
    private String gender;
    private long mobile;
    private String address;
    private String city;
    private String state;
    private int pincode;


    NewUser(String userName,String password,String fName,String mName,String lName,String dob,String nation,String gender,long mobile,String address,String city,String state,int pincode){
		
		super(userName,password);
		
		this.fName=fName;
		this.mName=mName;
		this.lName=lName;
		setName(fName+" "+lName);
		this.dob=dob;
		this.nation=nation;
		this.gender=gender;
		this.mobile=mobile;
		this.address=address;
		this.city=city;
		this.state=state;
		this.pincode=pincode;

}

    public void userDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UserName: ");
        this.setUserName(sc.next());
        sc.nextLine();
        System.out.print("Enter Password: ");
        this.setPassword(sc.nextLine());
        System.out.print("Enter Confirm Password: ");
        String cPassword = sc.nextLine();
        while (!this.getPassword().equals(cPassword)) {
            System.err.println("Incorrect password");
            System.out.print("Enter Password: ");
            this.setPassword(sc.nextLine());
            System.out.print("Enter Confirm Password: ");
            cPassword = sc.nextLine();
        }
        System.out.print("Enter First Name: ");
        fName = sc.next();
        System.out.print("Enter Middle Name: ");
        mName = sc.next();
        System.out.print("Enter Last Name: ");
        lName = sc.next();
        setName(fName+" "+lName);
        System.out.print("Enter Date Of Birth(DD/MM/YYYY): ");
        dob = sc.next();
        System.out.print("Nationality: ");
        nation = sc.next();
        System.out.print("Gender: ");
        gender = sc.next();
        System.out.print("Mobile No.: ");
        mobile = sc.nextLong();
        while (mobile < 1000000000L || mobile >= 10000000000L) {
            System.err.println("Entered mobile number is not valid");
            System.out.print("Mobile No.: ");
            mobile = sc.nextLong();
        }
        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("City/Village: ");
        city = sc.nextLine();
        System.out.print("State: ");
        state = sc.nextLine();
        System.out.print("Pincode: ");
        pincode = sc.nextInt();
        System.out.println("*****************************************************************************************************************************************");
        System.out.println("                                                    User registered successfully");
        System.out.println("*****************************************************************************************************************************************");

    }
}