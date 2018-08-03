package com.taxcalculator;
public class TaxCalculator {
	private String empName;
	private double empSal;
	private boolean isIndian;
     public TaxCalculator(String empName,boolean isIndian,double empSal) {
    	this.empName=empName;
    	this.isIndian=isIndian;
    	this.empSal=empSal;
     }
     public double calculateTax() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException{
    	 double taxAmount=0;
    	 if(isIndian==true) {
    		if(empName.isEmpty()) {
    			throw new EmployeeNameInvalidException("The Employee name cannot be empty");
    		}
    		else {
    			if(empSal>=100000) {
    				taxAmount=empSal*0.08;
    			}
    			else if(empSal>=50000 && empSal<=100000) {
    				taxAmount=empSal*0.06;
    			}
    			else if(empSal>=30000 && empSal<=50000) {
    				taxAmount=empSal*0.05;
    			}
    			else if(empSal>=10000 && empSal<=30000) {
    				taxAmount=empSal*0.04;
    			}
    			else {
    				throw new TaxNotEligibleException("The employee not need to pay tax");
    			}
    		}
    	 }
    	 else {
    		 throw new CountryNotValidException("The employee should be an Indian citizen for calculating Tax");
    	 }
    	 return taxAmount;
     }
     
}
