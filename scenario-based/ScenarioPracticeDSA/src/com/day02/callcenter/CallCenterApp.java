

package com.day02.callcenter;

public class CallCenterApp {
	
	public static void main(String[] args) {
	
		CallCenter callCenter = new CallCenter();
		System.out.println("===== Call Center =====\n");

		// Incoming calls
		callCenter.receiveCall(new Call("C101", "Divyansh Pandey", false, "Internet not working"));
		callCenter.receiveCall(new Call("C205", "Akshat Jain", true, "Billing dispute"));
		callCenter.receiveCall(new Call("C101", "Divyansh Pandey", false, "Slow speed again"));
		callCenter.receiveCall(new Call("C308", "Abhishek Puri Goswami", false, "New connection request"));
		callCenter.receiveCall(new Call("C205", "Akshat Jain", true, "Urgent - port out issue"));
		callCenter.receiveCall(new Call("C412", "Hariom Patel", false, "Recharge problem"));

		callCenter.showQueueStatus();

		// Agent starts attending calls
		System.out.println("\nAgent starts attending calls...");

		callCenter.attendNextCall();
		callCenter.attendNextCall();
		callCenter.attendNextCall();
		callCenter.attendNextCall();
		
		callCenter.showQueueStatus();

		// Show statistics at the end
		callCenter.showCallStatistics();

		System.out.println("\n===== Thanks for calling =====");
	}
}
