package com.capg.loginservice;

import com.capg.logindao.Login_DAO;

public class Login_Service implements LoginService {
	public boolean validateLogin(String userName,String passWord,String email){  
		try {
			if(userName.length()<=15 && passWord.length()<=10) {
				Login_DAO dao=new Login_DAO();
				return dao.validateLogin1(passWord);
			}
			else
				throw new InvalidCredentialsException("Invalid credentials");
		}
		catch(InvalidCredentialsException e)
		{
			System.out.println(e);
		}
		return false;
		
		
	}

}
class InvalidCredentialsException extends Exception{
	InvalidCredentialsException(String msg)
	{
		super(msg);
	}
}