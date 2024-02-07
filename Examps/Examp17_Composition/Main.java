package Examps.Examp17_Composition;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(2.5f, 8 );
        Car car = new Car("Mercedes", "E200", engine);

        car.getEngine().engineOn();
        car.getEngine().engineOff();
    }
}
