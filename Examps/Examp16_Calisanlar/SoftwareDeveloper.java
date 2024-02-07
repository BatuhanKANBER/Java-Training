package Examps.Examp16_Calisanlar;

public class SoftwareDeveloper extends Workers{
    private String usedSystem;
    public SoftwareDeveloper(String name, String department, int salary, String usedSystem) {
        super(name, department, salary);
        this.usedSystem = usedSystem;
    }

    public String getUsedSystem() {
        return usedSystem;
    }

    public void setUsedSystem(String usedSystem) {
        this.usedSystem = usedSystem;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Kullanılan sistem: " + getUsedSystem());
    }

    public void chanegeUsedSystem(String newSystem){
        setUsedSystem(newSystem);
        System.out.println(getName() + " kişisinin kullanılan sistemi " + getUsedSystem() + " olarak değiştirildi.");
    }
}
