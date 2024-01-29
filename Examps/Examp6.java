package Examps;
import java.util.Scanner;
//HESAP MAKİNASI
public class Examp6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result, fitstNumber, secondNumber;

        System.out.println("TOPLAMA İŞLEMİ İÇİN 1, ÇIKARMA İŞLEMİ İÇİN 2, ÇARPMA İŞLEMİ İÇİN 3, BÖLME İŞLEMİ İÇİN 4");
        int operationsNumber = input.nextInt();
        switch (operationsNumber){
            case 1 :
                System.out.print("Sayı 1: ");
                fitstNumber = input.nextInt();

                System.out.print("Sayı 2: ");
                secondNumber = input.nextInt();

                result = fitstNumber + secondNumber;
                System.out.println("SONUÇ: " + result);
                break;
            case 2 :
                System.out.print("Sayı 1: ");
                fitstNumber = input.nextInt();

                System.out.print("Sayı 2: ");
                secondNumber = input.nextInt();

                result = fitstNumber - secondNumber;
                System.out.println("SONUÇ: " + result);
                break;
            case 3 :
                System.out.print("Sayı 1: ");
                fitstNumber = input.nextInt();

                System.out.print("Sayı 2: ");
                secondNumber = input.nextInt();

                result = fitstNumber * secondNumber;
                System.out.println("SONUÇ: " + result);
                break;
            case 4 :
                System.out.print("Sayı 1: ");
                fitstNumber = input.nextInt();

                System.out.print("Sayı 2: ");
                secondNumber = input.nextInt();

                result = fitstNumber / secondNumber;
                System.out.println("SONUÇ: " + result);
                break;
            default:
                System.out.println("HATALI GİRİŞ!");
                break;
        }
    }
}
