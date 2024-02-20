package Examps.Examp36_GenericTypeConstructer;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes","E200",1995 );
        Car car2 = new Car<String>("BMW", "5.20","2020");
        System.out.println(car1);
        car2.showInfo();
    }
}
