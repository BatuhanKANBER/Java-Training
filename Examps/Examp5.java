package Examps;
import java.util.Scanner;
//HARF NOTU HESAPLAMA
public class Examp5 {
    public static void main(String[] args) {
        float result;
        Scanner input = new Scanner(System.in);

        System.out.print("Vize: ");
        float _visa = input.nextFloat();

        System.out.print("Proje: ");
        float _project = input.nextFloat();

        System.out.print("Final: ");
        float _final = input.nextFloat();

        result =(float) ((_visa*0.3) + (_project*0.3) + (_final*0.4));
        System.out.println("Notunuz: " + result);

        System.out.print("Harf Notunuz: ");
        if (result >= 85)
            System.out.println("AA");
        else if (85 > result && result >= 80)
            System.out.println("BA");
        else if (80 > result && result >= 75)
            System.out.println("BB");
        else if (75 > result && result >= 70)
            System.out.println("CB");
        else if (70 > result && result >= 65)
            System.out.println("CC");
        else if (65 > result && result >= 60)
            System.out.println("DC");
        else if (60 > result && result >= 55)
            System.out.println("DD");
        else if (55 > result && result >= 50)
            System.out.println("FD");
        else if (50 > result)
            System.out.println("FF");
    }
}
