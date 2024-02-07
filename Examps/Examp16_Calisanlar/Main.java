package Examps.Examp16_Calisanlar;

public class Main {
    public static void main(String[] args) {
        SoftwareDeveloper worker = new SoftwareDeveloper("Batuhan KANBER", "AR-GE", 45000, "Windows");
        Manager manager = new Manager("Yönetici", "AR-GE", 90000, 10);

        worker.chanegeUsedSystem("Linux");
        worker.changeSalary(50000);
        manager.changeResponsWorkersCount(8);
        manager.changeDepartment("İnsan Kaynakları");

        worker.showInfo();
        manager.showInfo();
    }
}
