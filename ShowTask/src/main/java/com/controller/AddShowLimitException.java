package com.controller;


//Extra Exception Class Not in USed
public class AddShowLimitException extends RuntimeException {

	
	public AddShowLimitException()
	{
		super("HallId ShouldBe In Between 1 to 5");
	}

	@Override
	public String toString() {
		return "HallId ShouldBe In Between 1 to 5";
	}
}
