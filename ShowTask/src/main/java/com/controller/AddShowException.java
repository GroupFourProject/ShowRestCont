package com.controller;

public class AddShowException extends RuntimeException {

	public AddShowException()
	{
		super("Hall ID Should be In Between 1 to 5 Or Hall Id Limit Is Exceed");
	}

	@Override
	public String toString() {
		return "Hall ID Should be In Between 1 to 5 Or Hall Id Limit Is Exceed";
			
	}
	
	
}
