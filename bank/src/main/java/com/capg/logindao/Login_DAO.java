package com.capg.logindao;

import java.util.HashMap;

public class Login_DAO implements LoginDAO {
	public boolean validateLogin1(String passWord) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("1001","leela");
		hm.put("1002","krishna");
		hm.put("1003","leelakrishna");
		if(hm.containsKey(passWord)) {
			return true;
		}
		else
			return false;
		
	}

}
