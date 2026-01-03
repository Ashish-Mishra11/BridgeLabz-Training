package com.day01.ewalletapplication;
public class EWalletAppDriver {
    public static void main(String[] args) {

        // User 1 – Personal user with referral bonus
        User user1 = new User(
                "User1",
                new PersonalWallet(1000, true)
        );

        // User 2 – Business user
        User user2 = new User(
                "User2",
                new BusinessWallet(3000, false)
        );

        // Transactions
        user1.getWallet().transferTo(user2, 500);
        user2.getWallet().transferTo(user1, 1000);

        // Balances
        System.out.println("\nFinal Balances:");
        System.out.println("User1 Balance: ₹" + user1.getWallet().getBalance());
        System.out.println("User2 Balance: ₹" + user2.getWallet().getBalance());


    }
}
