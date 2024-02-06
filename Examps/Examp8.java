package Examps;

import java.util.Scanner;

//ATM Uygulaması
public class Examp8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operations;

        do {
            System.out.println("Para çekme için - 1\nPara yatırma için - 2\nÇıkmak için - q\n***************");
            operations = input.nextLine();
            if (operations.equals("1")){
                System.out.println("Para çekme işlemi yapıldı.\n***************");
            } else if (operations.equals("2")) {
                System.out.println("Para yatırma işlemi yapıldı.\n***************");
            } else if (!operations.isEmpty() && !operations.equals("q")){
                System.out.println("Hatalı işlem!");
            }
        } while (!operations.equals("q"));
    }
}
