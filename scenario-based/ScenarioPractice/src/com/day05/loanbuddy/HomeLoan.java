package com.day05.loanbuddy;

public class HomeLoan extends LoanApplication implements IApprovable{
	Applicant ap1;
	HomeLoan(int term,Applicant ap1){
		interestRate = 12.0;
		this.term = term;
		this.ap1 = ap1;
	}
	public boolean approveLoan( double income) {
		double creditScore = ap1.getCreditScore();
		if(creditScore > 5 && income >=50000 ) {
			System.out.println("Loan Approved");
			return true;
		} else {
			System.out.println("Loan Rejected");
			return false;
		}
	}
	public void calculateEMI(double loanAmount) {
		double monthlyRate = interestRate / (12 * 100); // 12% → 0.01
	    int months = term * 12;

	    double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
	                 (Math.pow(1 + monthlyRate, months) - 1);

	    System.out.println("Your EMI is: " + emi);
	}

}
