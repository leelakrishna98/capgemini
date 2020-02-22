package com.capg.passbookservice;

import java.text.SimpleDateFormat;

import com.capg.passbookdao.Passbook_DAO;

public class Passbook_Service implements PassbookService {
	public boolean checkAccNo(String accountId1) {
		try {
			if(accountId1.length()==12) {
				Passbook_DAO dao=new Passbook_DAO();
				return dao.updatePassbook1(accountId1);
			}
			else {
				throw new InvalidAccountNumberException("Invalid account number");
				
			}    
		}
		catch(InvalidAccountNumberException e)
		{
			System.out.println(e);
		}
		return false;
	}
	public boolean checkDates(String accountId1,String date1,String date2) {
		try {
		if(!(accountId1.length()==12)){
			throw new InvalidAccountNumberException("Invalid account number");
		}}
		catch(InvalidAccountNumberException e) {
			System.out.println(e);
		}
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         java.util.Date date11=null;
         try {
             date11 = dateFormat.parse(date1);
         } catch (Exception e) {
           
             e.printStackTrace();
         }
         
         java.util.Date date22=null;
         try {
             date22 = dateFormat.parse(date2);
         } catch (Exception e) {
           
             e.printStackTrace();
         }

 		if(date11.compareTo(date22) > 0) {
 			System.out.println("Date 1 occurs after Date 2");
 			 return false;
 		}
 	
 		if(date11.compareTo(date22) < 0) {
 			Passbook_DAO dao=new Passbook_DAO();
     		return dao.accountValidation(accountId1);
     	
 		}
 		if(date11.compareTo(date22) == 0) {
 	         System.out.println("invalid dates");
 	         return false;
 	         
 		}
 		return false;
	}

}
class InvalidAccountNumberException extends Exception{
	InvalidAccountNumberException(String msg){
		super(msg);
		
	}
}