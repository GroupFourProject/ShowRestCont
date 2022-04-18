package com.controller;

public class UpdateShowException extends RuntimeException {

	public UpdateShowException()
	{
		super("ShowId Is Not Available In DataBase To Update");
	}

	@Override
	public String toString() {
		return "ShowId Is Not Available In DataBase To Update";
	}
	
	
}
