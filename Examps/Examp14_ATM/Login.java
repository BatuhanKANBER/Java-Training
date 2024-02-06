package Examps.Examp14_ATM;

import java.util.Scanner;

public class Login {
    Scanner input = new Scanner(System.in);
    private String username;
    private String password;

    public boolean login(Account account){
            System.out.print("Kullanıcı adı: ");
            username = input.nextLine();

            System.out.println("Parola: ");
            password = input.nextLine();

            if (username.equals(account.getUsername()) && password.equals(account.getPassword()))
                return true;
            else
                return false;
    }
}
