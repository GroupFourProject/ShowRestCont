package com.controller;


public class DeleteShowException extends RuntimeException{

		private int id;
		public DeleteShowException(int id)
		{
			super("id "+ id +" Not available");
			this.id=id;
			
		}
		@Override
		public String toString() {
			return "Id "+ id +" Not Available";
		}
		
		
}
