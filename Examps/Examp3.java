package Examps;
import java.util.Scanner;
//EN YÜKSEK SAYIYI BULMA
public class Examp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı 1:");
        int firstNumber = input.nextInt();

        System.out.print("Sayı 2:");
        int secondNumber = input.nextInt();

        System.out.print("Sayı 3:");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber)
                System.out.println("En  büyük sayı: " + firstNumber);
            else
                System.out.println("En büyük sayı: " + thirdNumber);
        }
        else if (secondNumber > thirdNumber){
            System.out.println("En büyük sayı: " + secondNumber);
        } else {
            System.out.println("En büyük sayı: " + thirdNumber);
        }
    }
}
