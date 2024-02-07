package Examps.Examp17_Composition;

public class Engine {

    private float capacity;
    private int cylinder;

    public Engine(float capacity, int cylinder) {
        this.capacity = capacity;
        this.cylinder = cylinder;
    }

    public void engineOn(){
        System.out.println("Motor çalıştırılıyor...");
    }

    public void engineOff(){
        System.out.println("Motor kapatılıyor...");
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
}
