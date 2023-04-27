package com.company.designpatterns.proxyDP;

public class ProxyRunner {
    public static void main(String[] args) {

        SavingAccount account = new SavingAccount(1000);
        BankAccount debitCardProxy = new DebitCardProxy(account);
        debitCardProxy.debit(1000);
    }
}
