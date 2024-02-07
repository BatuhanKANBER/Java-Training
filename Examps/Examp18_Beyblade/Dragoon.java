package Examps.Examp18_Beyblade;

public class Dragoon extends BaseBeyblade {
    private String holyMonster;
    public Dragoon(String name, String owner, String holyMonster, int power) {
        super(owner, name, power);
        this.holyMonster = holyMonster;
    }

    public String getHolyMonster() {
        return holyMonster;
    }

    public void setHolyMonster(String holyMonster) {
        this.holyMonster = holyMonster;
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void transformHolyMonster() {
        System.out.println(getName() + ", " + getHolyMonster() + " canavarına dönüştü.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kutsal Canavar: " + holyMonster);
    }
}
