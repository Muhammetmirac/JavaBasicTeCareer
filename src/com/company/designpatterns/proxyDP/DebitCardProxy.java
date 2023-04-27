package com.company.designpatterns.proxyDP;



public class DebitCardProxy implements BankAccount{
    SavingAccount savingAccount;


    public DebitCardProxy(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    @Override
    public void debit(double amount) {
        if (savingAccount.validate(amount)) {
            savingAccount.debit(amount);
        } else {
            System.out.println("Yetersiz bakiyeden dolayı geçersiz işlem.");
        }
    }
}