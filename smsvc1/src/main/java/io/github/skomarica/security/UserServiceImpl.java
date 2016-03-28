package io.github.skomarica.security;

public class UserServiceImpl implements UserService {

	@Override
	public String getDefaultUser(){
		return "admin";
	}
	
}
