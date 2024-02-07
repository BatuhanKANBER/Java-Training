package Examps.Examp16_Calisanlar;

public class Workers {
    private String name;
    private String department;
    private int salary;

    public Workers(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Adı: " + name + "\nBölümü: " + department + "\nMaaşı: " + salary + "TL");
    }

    public void changeDepartment(String newDepartment){
        setDepartment(newDepartment);
        System.out.println(getName() + " kişisinin bölümü " + getDepartment() + " olarak değiştirilmiştir.");
    }

    public void changeSalary(int value){
        setSalary(value);
        System.out.println(getName() + " kişisinin maaşı " + getSalary() + "TL olarak değiştirilmiştir.");
    }
}
