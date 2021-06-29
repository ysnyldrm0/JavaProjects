package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1,20.0,"Yasin YILDIRIM",
                                                    "ysnyldrm0@hotmail.com","05059398206");
        bankAccount.depositFunds(10.0);
        bankAccount.withdrawalFunds(50.0);
        System.out.println("Balance: " + bankAccount.getBalance());

        //ADDED

    }
}

// Coded by ysnyldrm