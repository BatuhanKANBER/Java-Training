package Examps.Examp35_GenericTypeMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <E> void showList(List<E> list){
        for (E e: list ){
            System.out.println(e);;
        }
    }
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(){{
            add(new Cat("Boncuk"));
            add(new Cat("Nazlı"));
        }};

        List<Dog> dogs = new ArrayList<>(){{
           add(new Dog("Rocky"));
           add(new Dog("Bulut"));
        }};

        showList(cats);
        showList(dogs);
    }
}
