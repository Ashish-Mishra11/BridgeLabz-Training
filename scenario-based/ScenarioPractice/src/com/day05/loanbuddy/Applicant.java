package com.day05.loanbuddy;

public class Applicant {
	String name;
	private double creditScore;
	double income;
	double loanAmount;
	Applicant(String name,double creditScore,double income,double loanAmount){
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	public double getCreditScore() {
		return creditScore;
	}

}
