package com.controller;

public class GetShowException extends RuntimeException{

	public GetShowException()
	{
		super("ShowId Is Not Available");
	}

	@Override
	public String toString() {
		return "ShowId Is Not Available";
	}
	
	
}
