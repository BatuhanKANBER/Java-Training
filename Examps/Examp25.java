package Examps;

public class Examp25 {

    // Girdi: 1,2,3,4      Çıktı: 1,2,6,10
    public static int[] firstQuiz(int[] input){
        int[] result = {};//Default verilen kodlar
        int len = input.length;
        result = input.clone();

        for (int i = 0; i < len; i++){
            if (i == 0){
                result[i] = input[i];
            }else{
                result[i] = result[i-1] + input[i];
            }
        }

        return result;
    }
    public static int[] secondQuiz(int[] input){
        int[] result = new int[0];//Default verilen kodlar
        int len = input.length;
        result = input.clone();

        for (int i = 0; i < len; i++){
            if (i == 0){
                result[i] = input[i];
            }else{
                result[i] = result[i-1] + input[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int array1[] = firstQuiz(input);
        int array2[] = secondQuiz(input);

        for (int arr: array1){
            System.out.print(arr + ",");
        }
        System.out.println("");
        for (int arr: array2){
            System.out.print(arr + ",");
        }
    }
}
