package com.capg.logincontroller;

import java.util.Scanner;

import com.capg.loginservice.Login_Service;
import com.capg.passbookcontroller.Passbook_Controller;

public class Login_Controller{
	public static void main(String args[]) {
		int n=1;
		while(n!=0) {
			Scanner sc=new Scanner(System.in);
			   System.out.println("Login page");
		       System.out.println("enter username:");
		       String userName=sc.next();
		       System.out.println("enter password");
		       String passWord=sc.next();
		       System.out.println("enter email");
		       String email=sc.next();
		       Login_Service ls=new Login_Service();
		      boolean a=ls.validateLogin(userName,passWord,email);
		       if(ls.validateLogin(userName,passWord,email))
		    	   System.out.println("login successful");
		       else
		    	   System.out.println("login failed");
		       /////////////////////////////////////
		       while(a) {
		             	System.out.println("enter your choice");
			
			            System.out.println("1.Account");
		            	System.out.println("2.Transaction");
			            System.out.println("3.Loan");
			            System.out.println("4.Passbook"); 
			
		
		             	int ch=sc.nextInt();
			            switch(ch) {
			 
		            	case 1:
		            	case 2:
		            	case 3:
		            	case 4:Passbook_Controller.passBook();
		            	       
			            }
			  }
			
		}
	}

}
