package com.day05.loanbuddy;

import java.util.Scanner;
public class LoanBuddyDriver {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=============Welcome to loan application========");
		while(true) {
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter your credit score: ");
			double creditScore = sc.nextDouble();
			
			System.out.println("Enter your income: ");
			double income = sc.nextDouble();
			
			System.out.println("Enter the amount you required for loan: ");
			double loanAmount = sc.nextDouble();
			sc.nextLine();
			
			Applicant ap1 = new Applicant( name, creditScore, income, loanAmount);
			
			System.out.println("Enter the type of loan required (home, personal): ");
			String loanType = sc.nextLine().toLowerCase();
			
			System.out.println("Enter the time period of loan amount: ");
			int term = sc.nextInt();
			sc.nextLine();
			
			if(loanType.equals("home")) {
				IApprovable la = new HomeLoan(term,ap1);
				if(la.approveLoan( income)) {
					la.calculateEMI(loanAmount);
				}
				
				
			} else {
				IApprovable la = new PersonalLoan(term,ap1);
				if(la.approveLoan( income)) {
					la.calculateEMI(loanAmount);
				}
			}
			
			System.out.println("Want to continue enter 1 else 0: ");
			int a = sc.nextInt();
			sc.nextLine();
			if(a==0) {
				break;
			}
		}
		
		sc.close();
	}

}
