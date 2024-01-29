package Examps;
import java.util.Scanner;
//DİK ÜÇGEN HİPOTENÜS BULMA
public class Examp2 {
    public static void main(String[] args) {
        float sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("A Kenarı:");
        int a = input.nextInt();

        System.out.print("B Kenarı:");
        int b = input.nextInt();

        sonuc =(float) Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));

        System.out.print("A Kenarı: " + a + "\n" + "B Kenarı: " + b + "\n" + "Hipotenüs: " + sonuc);
    }
}
