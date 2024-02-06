package Examps;

import java.util.Scanner;

// 2 Sayının EBOBunu bulma
public class Examp12 {
    public static int ebob(int firstNumber, int secondNumber){
        for (int i = firstNumber; i > 0; i--){
            if (firstNumber % i == 0 && secondNumber % i == 0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayı: ");
        int firstNumber = input.nextInt();

        System.out.print("İkinci sayı: ");
        int secondNumber = input.nextInt();

        System.out.println(ebob(firstNumber,secondNumber));
    }
}
