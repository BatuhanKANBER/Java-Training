package Examps.Examp15_SporProgramı;

public class Person {

    private String name;
    private int kg;
    private boolean health;

    public Person(String name, int kg, boolean health) {
        this.name = name;
        this.kg = kg;
        this.health = health;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public Person(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
