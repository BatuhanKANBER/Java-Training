package Examps.Examp26_OyunKarakteri;

public class Kratos extends Character implements IWeapon, IProtacted{
    private int damage;
    public Kratos(String name, int power, int damage, String skin){
        super(name, power, skin);
        this.damage = damage;
    }
    @Override
    public String attack() {
        return getName() + ", saldırıyor.";
    }
    @Override
    public String defense() {
        return getName() + ", savunuyor.";
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(attack());
        System.out.println(defense());
    }
}
