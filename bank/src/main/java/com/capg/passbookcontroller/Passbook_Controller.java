package com.capg.passbookcontroller;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.capg.logincontroller.Login_Controller;
import com.capg.passbookservice.Passbook_Service;

public class Passbook_Controller {
  // 	public static void main(String[] args) {
	   public static void passBook() {
		int n=1;
		while(n!=0) {
			System.out.println("enter your choice");
			System.out.println("1.update passbook");
			System.out.println("2.Account summary");
			System.out.println("3.exit");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter account number");
			       String AccountId=sc.next();
			       Passbook_Service ps=new Passbook_Service();
			      if( ps.checkAccNo(AccountId)) {
			    	  System.out.println("passbook is updated successfully");
			      }
			      else
			    	  System.out.println("passbook is not updated, account doesnt exists");
			      break;
			case 2:System.out.println("enter your account id:");
			       String AccountId1=sc.next();
			       System.out.println("Enter the start Date ");
                   String date1 = sc.next();
                   System.out.println("Enter the end date");
                   String date2=sc.next();
                   Passbook_Service ps1=new Passbook_Service();
		           if(ps1.checkDates(AccountId1,date1,date2)) {
		        	   System.out.println("passbook is updated");
		           }
		           else
		        	   System.out.println("passbook is not updated");
		           break;
		            			 
			       
			case 3:
			default:System.out.println("Invalid option");
			}
			
			
		}
	}

}
