package Examps;
//FAKTÖRİYEL
public class Examp7 {
    public static void main(String[] args) {
        //6! = 6*5*4*3*2*1 = 120
        int number = 6;
        int result = 1;
        for (int i = 1; i < number; i++){
            result *= i;
        }
        System.out.println(result);

        result = 1;
        for (int k = number - 1; k > 1; k--){
            result *=k;
        }
        System.out.println(result);
    }
}
