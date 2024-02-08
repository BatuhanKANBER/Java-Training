package Examps;

import java.util.*;

//Soldaki 0'ların toplamı ve sağdaki 1'lerin toplamında en iyi sonucu veren alt stringleri bulma
//Turkcell mülakat sorusu
public class Examp21 {

    public static int bestScore(String s){
        String leftString;
        String rightString;
        int leftCount = 0;
        int rightCount = 0;
        int len = s.length();
        int[] scores = new int[len - 1];

        for (int i = 1; i < len; i++){
            leftString = s.substring(0,i);
            rightString = s.substring(i,len);

            char[] lChars = leftString.toCharArray();
            char[] rChars = rightString.toCharArray();

            for (int j = 0; j < lChars.length; j++){
                if (lChars[j] == '0')
                    leftCount++;
            }

            for (int k = 0; k < rChars.length; k++){
                if (rChars[k] == '1')
                    rightCount++;
            }

            int score = rightCount + leftCount;
            System.out.println(leftString + " - " + rightString + " | skor: " + score);
            scores[i-1] = score;
            rightCount = 0;
            leftCount = 0;
        }
        Arrays.sort(scores);
        int best = scores[len - 2];
        return best;
    }
    public static void main(String[] args) {
        System.out.println("En iyi sonuç: " + bestScore("11111"));
    }
}
