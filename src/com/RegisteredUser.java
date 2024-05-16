package com;

import java.util.Random;
import java.util.Scanner;

interface User {
    void loginUser();
}

class RegisteredUser extends Ticket implements User  {
	
    private String userName;
    private String password;
    
    RegisteredUser(){
    	
    }

    RegisteredUser(String userName, String password) {
        this.userName=userName;
        this.password=password;
    }

    public void loginUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.next();
        sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        while (!username.equals(this.getUserName()) || !password.equals(this.getPassword())) {
            System.err.println("Username or password is incorrect!");
            System.out.println("Enter username: ");
            username = sc.next();
            sc.nextLine();
            System.out.println("Enter password: ");
            password = sc.nextLine();
        }
        captcha();
        System.out.println("*****************************************************************************************************************************************");
        System.out.println("                                                    User logged in successfully");
        System.out.println("*****************************************************************************************************************************************");
    }

    public void captcha() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String captcha = "";
        while (captcha.length() < 7) {
            int n = r.nextInt(122);
            if ((n >= 48 && n <= 57) || (n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
                captcha += (char) n;
            }
        }
        System.out.println("Captcha: " + captcha);

        System.out.println("Enter the captcha: ");
        String userCaptcha = sc.nextLine();
        if (userCaptcha.equals(captcha)) {
            System.out.println("Verification Successful");
        } else {
            System.out.println("Invalid captcha. Try again!!");
            captcha();
        }
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}