//class for exception if country is not valid
package com.taxcalculator;

public class CountryNotValidException extends Exception {
	public  CountryNotValidException(String message) {
		super(message);
	}
}
