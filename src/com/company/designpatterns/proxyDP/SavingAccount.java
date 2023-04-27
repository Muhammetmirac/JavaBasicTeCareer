package com.company.designpatterns.proxyDP;

public class SavingAccount implements BankAccount {
    private double balance;

    public SavingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void debit(double amount) {
        if (validate(amount)) {
            balance -= amount;
            System.out.println(amount + " TL hesabınızdan çekilmiştir. Güncel hesabınızdaki miktar : "+balance+" TL");
        }else {
            System.out.println("Yetersiz bakiyeden dolayı geçersiz işlem");
        }

    }

    public boolean validate(double amount) {
        return balance >= amount;
    }


}
