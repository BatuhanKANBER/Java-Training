package Examps.Examp17_Composition;

public class Car {

    private String brand;
    private String modal;
    private Engine engine;

    public Car(String brand, String modal, Engine engine) {
        this.brand = brand;
        this.modal = modal;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
