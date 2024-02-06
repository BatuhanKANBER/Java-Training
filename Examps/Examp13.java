package Examps;

import java.util.Scanner;

//Gelişmiş Hesap Makinesi
public class Examp13 {
    public static int addition (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int addition (int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }

    public static int extraction (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static int extraction (int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber - secondNumber - thirdNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber, result;

        System.out.print("İKİ SAYILI İŞLEMLER İÇİN - 1, ÜÇ SAYILI İŞLEMLER İÇİN - 2: ");
        int operation = input.nextInt();

        switch (operation){
            case 1:
                System.out.print("İlk sayı: ");
                firstNumber = input.nextInt();

                System.out.print("İkinci sayı: ");
                secondNumber = input.nextInt();

                System.out.print("TOPLAMA İÇİN - 1, ÇIKARMA İÇİN - 2: ");
                operation = input.nextInt();
                switch (operation){
                    case 1:
                        result = addition(firstNumber, secondNumber);
                        System.out.println("SONUÇ: " + result);
                        break;
                    case 2:
                        result = extraction(firstNumber, secondNumber);
                        System.out.println("SONUÇ: " + result);
                        break;
                    default:
                        System.out.println("HATALI İŞLEM!");
                        break;
                }
                break;
            case 2:
                System.out.print("İlk sayı: ");
                firstNumber = input.nextInt();

                System.out.print("İkinci sayı: ");
                secondNumber = input.nextInt();

                System.out.print("Üçüncü sayı: ");
                thirdNumber = input.nextInt();

                System.out.print("TOPLAMA İÇİN - 1, ÇIKARMA İÇİN - 2: ");
                operation = input.nextInt();
                switch (operation){
                    case 1:
                        result = addition(firstNumber, secondNumber, thirdNumber);
                        System.out.println("SONUÇ: " + result);
                        break;
                    case 2:
                        result = extraction(firstNumber, secondNumber, thirdNumber);
                        System.out.println("SONUÇ: " + result);
                        break;
                    default:
                        System.out.println("HATALI İŞLEM!");
                        break;
                }
                break;
            default:
                System.out.println("HATALI İŞLEM!");
                break;
        }
    }
}
