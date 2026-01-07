package com.day05.loanbuddy;

public class PersonalLoan extends LoanApplication implements IApprovable {
	Applicant ap1;
	PersonalLoan(int term, Applicant ap1){
		interestRate = 15.0;
		this.term = term;
		this.ap1 = ap1;
	}
	public boolean approveLoan( double income) {
		double creditScore = ap1.getCreditScore();
		if(creditScore > 7 && income >=75000 ) {
			System.out.println("Loan Approved");
			return true;
		} else {
			System.out.println("Loan Rejected");
			return false;
		}
	}
	public void calculateEMI(double loanAmount) {
		double emi = loanAmount * interestRate * (Math.pow((1+interestRate),term)) / (Math.pow(1+interestRate,term)) - 1;
		System.out.println("your emi is: "+emi);
	}

}
