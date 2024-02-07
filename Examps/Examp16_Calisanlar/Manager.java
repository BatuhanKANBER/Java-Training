package Examps.Examp16_Calisanlar;

public class Manager extends Workers{
    private int responsWorkersCount;

    public int getResponsWorkersCount() {
        return responsWorkersCount;
    }

    public void setResponsWorkersCount(int responsWorkersCount) {
        this.responsWorkersCount = responsWorkersCount;
    }

    public Manager(String name, String department, int salary, int responsWorkersCount) {
        super(name, department, salary);
        this.responsWorkersCount = responsWorkersCount;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sorumlu olduğu çalışan sayısı: " + responsWorkersCount);
    }

    public void changeResponsWorkersCount(int value){
        setResponsWorkersCount(value);
        System.out.println(getName() + " kişisinin sorumlu olduğu çalışan sayısı " + getResponsWorkersCount() + " olarak değiştirildi.");
    }
}
