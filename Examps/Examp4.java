package Examps;
import java.util.Scanner;
//HAFTANIN GÜNLERİ
public class Examp4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gün: ");
        int day = input.nextInt();

        switch (day){
            case 1 :
                System.out.println("PAZARTESİ");
                break;
            case 2 :
                System.out.println("SALI");
                break;
            case 3 :
                System.out.println("ÇARŞAMBA");
                break;
            case 4 :
                System.out.println("PERŞEMBE");
                break;
            case 5 :
                System.out.println("CUMA");
                break;
            case 6 :
                System.out.println("CUMARTESİ");
                break;
            case 7 :
                System.out.println("PAZAR");
                break;
            default:
                System.out.println("HATALI GİRİŞ");
                break;
        }
    }
}
