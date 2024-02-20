package Examps.Examp32_GenericClass;
//Otomatik generic class
public class GenericClass {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bu jenerik bir sınıftır.";
    }

    public void showClassName(){
        System.out.println(this.value.getClass().getName());
    }
}
