package com.customexception.matrimonyeg;

public class InvalidAgeException extends RuntimeException {
	private String detail;
	InvalidAgeException(String detail){
		this.detail=detail;
	}
	@Override
	public String getMessage() {
		return detail;
	}
	

}
