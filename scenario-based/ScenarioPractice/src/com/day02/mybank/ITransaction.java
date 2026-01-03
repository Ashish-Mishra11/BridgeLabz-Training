package com.day02.mybank;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
