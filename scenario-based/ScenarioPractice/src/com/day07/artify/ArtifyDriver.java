package com.day07.artify;
import java.util.Scanner;
public class ArtifyDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// hard coding the value for digital art
		Artwork aa = new Artwork();
	
		DigitalArt d1 = new DigitalArt("Neon City Dreams", "Ava Martinez", 120, "Personal");
		DigitalArt d2 = new DigitalArt("Cosmic Bloom", "Rohan Mehta", 250, "Commercial");
		
		aa.l1.add(d1);
		aa.l1.add(d2);
		
		 
		PrintArt p1 = new PrintArt("Golden Horizon", "Emily Carter", 180, "Personal");
		PrintArt p2 = new PrintArt("Vintage Bloom", "Daniel Roberts", 180, "Commercial");
		
		aa.l2.add(p1);
		aa.l2.add(p2);
		
		while(true)
		{
			System.out.println("enter your name: ");
			String name = sc.nextLine();
			System.out.println("Enter the wallet balance: ");
			double walletBalance = sc.nextDouble();
			
			System.out.println("Which product you want to buy:(enter 1 or 2)\n"
					+ "1.digitalart\n"
					+ "2.printart"
					);
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("enter the name of digital product:\n"
						+ "Neon City Dreams\n"
						+ "Cosmic Bloom");
				String product = sc.nextLine();
				User u1 = new User(name, walletBalance,aa,product,choice);
				
				boolean b =u1.license();
				if(b) {
					u1.purchase();
				} else{
					System.out.println("Sorry! The product is personal you cannot buy.");				}
				break;
			case 2:
				System.out.println("enter the name of print product:\n"
						+ "Golden Horizon\n"
						+ "Vintage Bloom");
				String product2 = sc.nextLine();
				User u2 = new User(name, walletBalance,aa,product2,choice);
				boolean b1 =u2.license();
				if(b1) {
					u2.purchase();
				} else {
					System.out.println("Sorry! The product is personal you cannot buy.");
				}
				
				break;
				
			
			}
		
			
			
			System.out.println("Want to continue enter 1 else 0");
			int number = sc.nextInt();
			sc.nextLine();
			if(number == 0) {
				break;
			}
		}
        sc.close();
	}

}
