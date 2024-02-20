package Examps.Examp36_GenericTypeConstructer;

public class Car <T>{
    private T brand;
    private T model;
    private T year;

    public Car(T brand, T model, T year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void showInfo(){
        String info = "Marka: " + this.brand + "\nModel: " + this.model + "\nÇıkış Yılı: " + this.year;
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Marka: " + this.brand + "\nModel: " + this.model + "\nÇıkış Yılı: " + this.year;
    }
}
