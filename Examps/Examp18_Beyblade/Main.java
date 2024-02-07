package Examps.Examp18_Beyblade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation;

        boolean operationCase = true;
        do {
            System.out.println("Hangi beyblade' i tanımak istesiniz?");
            operation = input.nextLine();

            switch (operation){
                case "dragoon":
                    BaseBeyblade dragoon = new Dragoon("Dragoon", "Kinomiya Takao", "Mavi Ejderha", 1000);
                    dragoon.attack();
                    dragoon.transformHolyMonster();
                    dragoon.showInfo();
                    break;
                case "dranzer":
                    BaseBeyblade dranzer = new Dranzer("Dranzer", "Kai Hiwatari", "Kırmızı Anka Kuşu", 800);
                    dranzer.attack();
                    dranzer.transformHolyMonster();
                    dranzer.showInfo();
                    break;
                case "jumpingbase":
                    BaseBeyblade jumpingbase = new JumpingBase("Jumping Base", "Bilgiç", 100);
                    jumpingbase.attack();
                    jumpingbase.transformHolyMonster();
                    jumpingbase.showInfo();
                    break;
                case "q":
                    operationCase =false;
                    break;
                default:
                    System.out.println("Böyle bir beyblade bulunmuyor.");
                    break;
            }
        }while (operationCase);
    }
}
