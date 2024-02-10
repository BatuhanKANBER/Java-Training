package Examps.Examp26_OyunKarakteri;

public class Character {
    private String name;
    private int power;
    private String skin;
    public Character(String name, int power, String skin){
        this.name = name;
        this.power = power;
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
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
    public void showInfo(){
        System.out.println("İsim: " + getName());
        System.out.println("Güç: " + getPower());
        System.out.println(getName() + " karakterinin görünüş: " + getSkin());
    }
}
