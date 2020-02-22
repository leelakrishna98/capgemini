package com.capg.passbookservice;

public interface PassbookService {
	public boolean checkAccNo(String accountId1);
	public boolean checkDates(String accountId1,String date1,String date2);
}
