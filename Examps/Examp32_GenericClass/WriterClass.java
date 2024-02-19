package Examps.Examp32_GenericClass;

public class WriterClass<E> {
    public void writer(E[] array){
        for (E e: array){
            System.out.println(e);
        }
    }
}
