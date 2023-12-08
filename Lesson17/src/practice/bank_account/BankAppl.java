package practice.bank_account;

import practice.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount account0 = new BankAccount(100L,"Bill Smith","Bank#1", 1, 100);
        account0.display();
        System.out.println(account0.getOwner());
        System.out.println(account0.getBalance());
        account0.deposit(500);
        System.out.println(account0.getBalance());
        account0.withdraw(400);
        System.out.println(account0.getBalance());
        account0.withdraw(300);
        System.out.println(account0.getBalance());
        BankAccount account1= new BankAccount(200L, "Bank#1",1);
        System.out.println(account1.getOwner());
    }
}
