package Examps.Examp14_ATM;

public class Account {
    private String username;
    private String password;
    private int balance;

    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;

        System.out.println(username + " adlı kullanıcının hesabı oluşturuldu.\nToplam bakiyeniz: " + balance);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawMoney(int value){
        if (value > this.balance) {
            System.out.println("Bakiye yetersiz.");
        } else {
            this.balance -= value;
            System.out.println("Yeni bakiyeniz: " + this.balance);
        }
    }

    public void deposit(int value){
        this.balance +=value;
        System.out.println("Yeni bakiyeniz: " + this.balance);
    }
}
