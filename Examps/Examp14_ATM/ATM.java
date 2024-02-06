package Examps.Examp14_ATM;

import java.util.Scanner;

public class ATM {
    Scanner input = new Scanner(System.in);
    private String operations;
    private int value;
    private int loginCount = 3;
    public void execute(Account account){
        Login loginOperations = new Login();

        boolean loginCase = true;
        while (loginCase) {
            if (loginOperations.login(account)){
                System.out.println("Hoşgeldiniz.");

                do {
                    System.out.print("PARA YATIRMA İŞLEMİ İÇİN 'y', PARA ÇEKME İŞLEMİ İÇİN 'ç' KARAKTERİNİ GİRİNİZ: ");
                    operations = input.nextLine();

                    switch (operations) {
                        case "ç":
                            System.out.print("Çekmek istediğiniz miktar: ");
                            value = input.nextInt();
                            account.withdrawMoney(value);
                            break;
                        case "y":
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            value = input.nextInt();
                            account.deposit(value);
                            break;
                    }

                    if (operations.equals("q"))
                        System.out.println("Çıkış yapılıyor...");
                }while (!operations.equals("q"));
            }else {
                loginCount--;
                System.out.println("Kullanıcı adı veya parola hatalı.\n" + loginCount + " giriş hakkınız kaldı!");
            }

            if (loginCount == 0)
                loginCase = false;
        }

    }
}
