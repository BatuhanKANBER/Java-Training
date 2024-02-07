package Examps.Examp15_SporProgramı;

import java.util.Scanner;

public class Exercise {
    private Scanner input = new Scanner(System.in);
    private int calorie;
    private int operations;

    public void make(Person person){
        if (!person.isHealth()){
            System.out.println(person.getName() + " kişisinin sağlık durumu egzersiz yapmaya uygun değil!");
        }else {
            System.out.println(person.getName() + " kişisi egzersiz yapabilir.");

            boolean exerciesCase = true;
            while (exerciesCase){
                System.out.print("KOŞMAK İÇİN - 1, YÜRÜMEK İÇİN - 2, ÇIKMAK İÇİN - 0: ");
                operations = input.nextInt();

                switch (operations){
                    case 1:
                        run(person);
                        break;
                    case 2:
                        walk(person);
                        break;
                }
                if (operations == 0)
                    exerciesCase = false;
            }
        }
    }

    public void run(Person person){
        int kg = person.getKg();
        int km;
        int totalCalorie = 0;

        do {
            System.out.print("Koşulan kilometre: ");
            km = input.nextInt();

            this.calorie = this.calorie + (km * 100);
            System.out.println("Yakılan kalori: " + this.calorie);

            totalCalorie += this.calorie;

            if (this.calorie > 5000){
                kg--;
                person.setKg(kg);
                this.calorie = 0;
            }
        }while (km > 0);

        System.out.println("Toplam yakmış olduğunuz kalori: " + totalCalorie + "\nGüncel kilonuz: " + kg);
    }

    public void walk(Person person){
        int kg = person.getKg();
        int km;
        int totalCalorie = 0;

        do {
            System.out.print("Yürünen kilometre: ");
            km = input.nextInt();

            this.calorie = this.calorie + (km * 50);
            System.out.println("Yakılan kalori: " + this.calorie);

            totalCalorie += this.calorie;

            if (this.calorie > 5000){
                kg--;
                person.setKg(kg);
                this.calorie = 0;
            }
        }while (km > 0);

        System.out.println("Toplam yakmış olduğunuz kalori: " + totalCalorie + "\nGüncel kilonuz: " + kg);
    }
}
