package Examps.Examp33_Balondor;

public class Main {

    public static void main(String[] args) {
        CristianoRonaldo cristianoRonaldo = new CristianoRonaldo("Cristiano Ronaldo", "Real Madrid",50, 30);
        LeonelMessi leonelMessi = new LeonelMessi("Leonel Messi", "Barcelona", 30, 50);

        cristianoRonaldo.showInfo();
        System.out.println("Katkı puanı: " + cristianoRonaldo.calculateContribution());

        System.out.println("********************");

        leonelMessi.showInfo();
        System.out.println("Katkı puanı: " + leonelMessi.calculateContribution());

        System.out.println("********************");

        ballondorWinner(cristianoRonaldo,leonelMessi);
    }

    public static <E extends FootballPlayer> void ballondorWinner(E footballPlayer1, E footballPlayer2){
        if (footballPlayer1.calculateContribution() > footballPlayer2.calculateContribution()){
            System.out.println(footballPlayer1.getName() + " ballon d'or kazananı.");
        }else {
            System.out.println(footballPlayer2.getName() + " ballon d'or kazananı.");
        }
    }
}
