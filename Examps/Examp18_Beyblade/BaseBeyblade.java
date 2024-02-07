package Examps.Examp18_Beyblade;

public class BaseBeyblade {
    private String owner;
    private String name;
    private int power;
    public BaseBeyblade(String owner, String name, int power) {
        this.owner = owner;
        this.name = name;
        this.power = power;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack(){
        System.out.println(getName() + " " + getPower() + " güç ile saldırıyor.");
    }

    public void transformHolyMonster(){
        System.out.println(getName() + ", kutsal canavarı bulunmuyor.");
    }

    public void showInfo(){
        System.out.println("Sahip: " + getOwner() + "\nAd: " + getName() + "\nGüç: " + power);
    }
}
