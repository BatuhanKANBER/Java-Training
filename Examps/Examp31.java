package Examps;
//Rekürsif fonksiyon
public class Examp31 {

    // 1 1 2 3 5 8 13 21

    public static int fibonacci(int number){
        int a = 1;
        int b = 1;
        int c;

        if (number < 3){
            return 1;
        }

        for (int i = 2; i < number; i++){
            c = a + b;
            b = a;
            a = c;
        }
        return  a;
    }
    public  static  int rFibonacci(int number){
        if (number < 3){
            return 1;
        }
        return fibonacci(number - 2) + fibonacci(number - 1);
    }
    public static void main(String[] args) {

        System.out.println("1'den 10'a kadar fibonacci: ");
        for (int i = 1; i <= 10; i++){
            System.out.print(fibonacci(i) + ",");
        }
        System.out.println("");
        for (int i = 1; i <= 10; i++){
            System.out.print(rFibonacci(i) + ",");
        }

    }
}
