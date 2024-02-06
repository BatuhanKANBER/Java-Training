package Examps;

import java.util.Scanner;

//Asal Sayı Yazdırma Fonksiyonu
public class Examp11 {
    public static boolean asalMi(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("SAYI GİR: ");
            number = input.nextInt();

            if (asalMi(number) != false && number != 2)
                System.out.println(number + " SAYISI ASALDIR.");
            else
                System.out.println(number + " SAYISI ASAL DEĞİLDİR.");
        }while (number < 1000);
    }
}
