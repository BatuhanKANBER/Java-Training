package Examps.Examp20_Futbolcular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int index, operation;
        FootballPlayers footballPlayers = new FootballPlayers();

        boolean operationCase = true;
        do {
            System.out.println("1 - FUTBOLCU EKLEME\n2 - FUTBOLCU GÜNCELLEME\n3 - FUTBOLCU SİLME\n4 - FUTBOLCULARI LİSTELEME\n0 - ÇIKIŞ\n");
            operation = input.nextInt();
            input.nextLine();//dummy input
            switch (operation){
                case 1:
                    System.out.print("Futbolcu: ");
                    name = input.nextLine();

                    footballPlayers.addPlayer(name);
                    break;
                case 2:
                    System.out.print("Güncellemek istediğiniz index: ");
                    index = input.nextInt();

                    input.nextLine();//dummy input

                    System.out.print("Futbolcu: ");
                    name = input.nextLine();

                    footballPlayers.updatePlayer(index, name);
                    break;
                case 3:
                    System.out.print("Listeden kaldırmak istediğiniz index: ");
                    index = input.nextInt();

                    footballPlayers.removePlayer(index);
                    break;
                case 4:
                    System.out.println("\n");
                    footballPlayers.showPlayers();
                    System.out.println("\n");
                    break;
                case 0:
                    operationCase = false;
                    break;
                default:
                    System.out.println("Hatalı işlem!");
                    break;
            }
        }while (operationCase);
    }
}
