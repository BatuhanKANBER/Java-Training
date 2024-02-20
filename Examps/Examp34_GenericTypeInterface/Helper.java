package Examps.Examp34_GenericTypeInterface;
import java.util.List;

public class Helper implements Converter<String,Integer>{

    @Override
    public String convert(Integer value) {
        return value.toString();
    }

    @Override
    public Integer reverse(String value) {
        return Integer.parseInt(value);
    }

    public <E> String getType(E e){
        String[] words = e.getClass().getName().split("\\.");
        String className = words[words.length - 1];
        return className;
    }

    public <E1, E2 extends List> void addToList1(E1[] array, E2 list){
        for (E1 e: array){
            list.add(e);
        }
    }

    public <E> void addToList2(E[] array, List<E> list){
        for (E e: array){
            list.add(e);
        }
    }

    public <E> void showList(List<E> list){
        for (E e: list){
            System.out.print(e + " ");
        }
        System.out.println("");
    }
}
