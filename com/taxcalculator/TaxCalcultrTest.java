package com.taxcalculator;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TaxCalcultrTest{
	 @Test(expected=CountryNotValidException.class)
	 public void testCase1() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		 TaxCalculator taxCalculator=new TaxCalculator("Ron",false,3400);
		 @SuppressWarnings("unused")
		 double tax=taxCalculator.calculateTax();
		 //Assert.assertTrue(true);
	 }
	 @Test(expected=TaxNotEligibleException.class)
	 public void testCase2() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		 TaxCalculator taxCalculator=new TaxCalculator("Tim",true,1000);
		 @SuppressWarnings("unused")
		 double tax=taxCalculator.calculateTax();
	 }
	 @Test
	 public void testCase3() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		 TaxCalculator taxCalculator=new TaxCalculator("Jack",true,55000);
		 @SuppressWarnings("unused")
		 double tax=taxCalculator.calculateTax();
		 Assert.assertEquals(3300, tax,0);
	 }
	 @Test(expected=EmployeeNameInvalidException.class)
	 public void testCase4() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException{
		 TaxCalculator taxCalculator=new TaxCalculator("",true,30000);
		 @SuppressWarnings("unused")
		 double tax=taxCalculator.calculateTax();
	 }
}
