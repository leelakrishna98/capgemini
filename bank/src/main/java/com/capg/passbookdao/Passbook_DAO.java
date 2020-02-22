package com.capg.passbookdao;

import java.util.HashMap;

public class Passbook_DAO implements PassbookDAO {
	public boolean updatePassbook1(String a1) {  //5
		HashMap<String,String> hm=new HashMap(); 
		hm.put( "123456789012","ravi");
		hm.put( "123456789013","krishna");
		hm.put( "123456789014","rahul");
		hm.put( "123456789015","karthik");
		if(hm.containsKey(a1)) { //6
		System.out.println("the passbook update details are ");
		System.out.println("account id: "+a1);
		System.out.println("name--> "+hm.get(a1));
		System.out.println("Current balance:14767");
		System.out.println("AccountSummary [transactionId=1012115, transactionDate-2020-02-10,amount transmitted=3000.0]");
		System.out.println("AccountSummary [transactionId=1012125, transactionDate-2020-02-19,amount transmitted=7000.0]");
		System.out.println("AccountSummary [transactionId=1012126, transactionDate-2020-02-18,amount transmitted=8000.0]");
		System.out.println("AccountSummary [transactionId=1012127, transactionDate-2020-02-08,amount transmitted=800.0]");
		System.out.println("AccountSummary [transactionId=1012128, transactionDate-2020-02-12,amount transmitted=9000.0]");
		return true;
		}
		else
			return false;
	}  //7
	////////////////////////////////////////
	public boolean accountValidation(String a) {
		HashMap<String,String> hm=new HashMap();
		hm.put( "123456789012","ravi");
		hm.put( "123456789013","krishna");
		hm.put( "123456789014","rahul");
		hm.put( "123456789015","karthik");
		if(hm.containsKey(a)) {
			System.out.println("account id:"+a);
			System.out.println("current balance:7200.0");
			System.out.println("the transaction details are");
			System.out.println("AccountSummary [transactionId=1012125, transactionDate-2020-02-19,amount transmitted=8000.0]");
			System.out.println("AccountSummary [transactionId=1012126, transactionDate-2020-02-18,amount transmitted=12000.0]");
			System.out.println("AccountSummary [transactionId=1012128, transactionDate-2020-02-12,amount transmitted=9 000.0]");
			return true;
		
		}
		else
			return false;
			
	}
	

}
