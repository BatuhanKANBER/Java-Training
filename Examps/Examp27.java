package Examps;
//Reverse
public class Examp27 {

    public static boolean isReverse(String s1, String s2){
        int count = 0;

        int len1 = s1.length();
        int len2 = s2.length();

        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();

        if (len1 != len2) {
            return false;
        }

        len2 -= 1;
        for (int i = 0; i < len1; i++){
            if (chArr1[i] == chArr2[len2]){
                count++;
            }
            len2--;
        }

        if (count == len1)
            return true;

        return false;
    }

    public static String reverse(String s1){
        StringBuilder sAnagram = new StringBuilder();
        int len = s1.length();
        char[] chArr = s1.toCharArray();

        for (int i = len - 1; i >= 0; i--){
            sAnagram.append(chArr[i]);
        }

        return sAnagram.toString();
    }
    public static void main(String[] args) {
        String s1 = "batuhan";
        System.out.println(s1 + " kelimesinin tersi: " + reverse(s1));
        String s2 = reverse(s1);

        if (isReverse(s1, s2)){
            System.out.println(s2 + " kelimesi " + s1 + " kelimesinin tersi.");
        }
    }
}
