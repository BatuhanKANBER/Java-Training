package Examps.Examp14_ATM;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("batuhan", "123", 1000);

        ATM atm = new ATM();

        atm.execute(account);


    }
}
