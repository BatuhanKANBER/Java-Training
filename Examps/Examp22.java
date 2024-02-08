package Examps;
//Turkcell mülakat sorusu
public class Examp22 {
    public static String myFunction(String inputString){
        int count1 = 0;
        int count2 = 0;

        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < inputString.length(); i++){
            if (charArray[i] == '#')
                count1++;
            else if (charArray[i] == '+')
                count2++;
        }

        return count1 + "," + count2;
    }
    public static void main(String[] args) {
        System.out.println(myFunction("qfrwefwegfS+-3+3234##£$"));
    }
}
