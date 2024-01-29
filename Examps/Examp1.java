package Examps;
import java.util.Scanner;
//BEDEN KİTLE İNDEKSİ HESAPLAMA
public class Examp1 {
    public static void main(String[] args){
        float sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Boy:");
        int boy = input.nextInt();

        System.out.println("Kilo:");
        int kilo = input.nextInt();

        sonuc = (float) (kilo/(Math.pow(boy , 2)));

        System.out.print("Boyunuz: " + boy + "\n" + "Kilonuz: " + kilo + "\n" + "Beden kitle indeksiniz: " + sonuc);
    }
}
