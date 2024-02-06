package Examps;
//Armstrong Sayısı
// 371 = 3^3 + 7^3 + 1^3
public class Examp9 {
    public static void main(String[] args) {
        int number = 371;
        int rem;
        int count = 0;
        int result = 0;
        int mockNumber1 = number;
        int mockNumber2 = number;

        //Basamak Sayısını Bulma
        do {
            count++;
            rem = mockNumber1 / 10;
            mockNumber1 = rem;
        }while (rem != 0);

        //Armstrong Hesaplama
        do {
            int value = mockNumber2 % 10;
            result =(int) (result + Math.pow(value,count));
            mockNumber2 /= 10;
        }while (mockNumber2 != 0);

        if (result == number)
            System.out.println("Bu bir armstrong sayısı.");
        else
            System.out.println("Bu bir armstrong sayısı değil.");
    }
}
