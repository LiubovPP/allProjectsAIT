package practice.bank_account.model;

public class BankAccount {
    private long id;//account, номер счета, уникальный
    private String owner; // владелец счета
    private String bankName;
    private int branch; // номер филиала
    private double balance; //


    // тип счета, валюта, адрес,
//
    // конструктор(ы) класса
    // конструктор класса на все поля, требует заполнить все поля
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    // коструктор без поля balance
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance = 0.0;
    }

    // конструктор - клиент без имени - John Don
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimus";
    }
    // конструктор анонимный клиент и без денег

    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        owner = "Anonimus";
        balance = 0.0;
    }

    public void display() {
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // положить деньги на счет
    public boolean deposit(double sum) {
        balance = balance + sum;
        return true;
    }

    // снять деньги со счета
    public boolean withdraw(double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }else
            return false;
    }

}