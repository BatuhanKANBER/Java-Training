package Examps.Examp37_GenericTypeClass2;

public class Human <T,U>{
    private String name;
    private T size;
    private U kg;

    public Human(String name, T size, U kg) {
        this.name = name;
        this.size = size;
        this.kg = kg;
    }

    public <T> String showType(T value){
        String[] words = value.getClass().getName().split("\\.");
        String type = words[words.length - 1];
        return type;
    }
    @Override
    public String toString() {
        return "Adı: " + this.name + "\nBoyu(" + showType(this.size) + "): " + size + "\nKilosu(" + showType(this.kg) + "): " + kg;
    }
}
