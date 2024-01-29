import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.nextLine(); //Bu satıra dummy input deniyor nexInt sonrası program gizli bir enter satırı oluşturduğu için sonraki nextLine satırı otomatik olarak boşluk karakterini döndürüyor dummy input sayesinde bu hatanın önüne geçiliyor.
        String name = input.nextLine();
        System.out.println("YAŞ: " + age + "\n" + "AD: " + name);
    }
}
