package com.day05.loanbuddy;

public interface IApprovable {
	boolean approveLoan( double income);
	void calculateEMI(double loanAmount);

}
