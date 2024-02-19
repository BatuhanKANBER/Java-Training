package Examps.Examp32_GenericClass;

public class Main {
    public static void main(String[] args) {
        Character[] chars = {'J','A','V','A'};
        String[] strings = {"Batuhan", "Kanber", "Giresun", "Görele"};
        Integer[] integers = {1,2,3,4,5,6,7,8,9,0};

        WriterClass<Character> characterWriter = new WriterClass<>();
        characterWriter.writer(chars);

        WriterClass<String> stringWriterClass = new WriterClass<>();
        stringWriterClass.writer(strings);

        WriterClass<Integer> integerWriterClass = new WriterClass<>();
        integerWriterClass.writer(integers);
    }
}
