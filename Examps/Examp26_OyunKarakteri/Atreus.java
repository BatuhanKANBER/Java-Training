package Examps.Examp26_OyunKarakteri;

public class Atreus extends Character implements IWeapon{
    private int damage;

    public Atreus(String name, int power, int damage, String skin){
        super(name, power, skin);
        this.damage = damage;
    }
    @Override
    public String attack() {
        return getName() + ", saldırıyor.";
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(attack());
    }
}
