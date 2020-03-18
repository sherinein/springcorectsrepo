package com.cts.service;

import java.util.List;

import com.cts.model.Registration;

public class RegisterService {
	List<Registration> register;
	
	public boolean validate(String user, String password) {
		if(user.equals(password))
			return true;
		return false;
	}
	/*public void validate(Registration r) {
	String user=r.getUsername();
	String password=r.getPassword();
	}*/

}
