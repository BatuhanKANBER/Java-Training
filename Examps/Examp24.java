package Examps;
//Bir dizideki karakterlerin sayısını yazdırma
public class Examp24 {

    public static String findChars(String[] strings){
        int count1 = 0;
        int count2 = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (String s: strings){
            stringBuilder.append(s);
        }

        for (int i = 0; i < stringBuilder.length(); i++){
            if (stringBuilder.charAt(i) == '#'){
                count1++;
            } else if (stringBuilder.charAt(i) == '+') {
                count2++;
            }
        }
        return count1 + "," + count2;
    }

    public static void main(String[] args) {
        String[] strings = {"++++####sfsdfdsf", "dfssdfsd£££>#£>$£$£#½+", "sdfcsdfdsf"};

        System.out.println(findChars(strings));
    }
}
