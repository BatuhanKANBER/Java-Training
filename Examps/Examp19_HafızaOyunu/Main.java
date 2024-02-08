package Examps.Examp19_HafızaOyunu;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowGuess1, columnGuess1, rowGuess2, columnGuess2;
        int count = 0;
        Card[][] cards = new Card[4][4];

        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');

        boolean gameCase = true;
        do {
            System.out.print("İlk karakter için satır tahmini: ");
            rowGuess1 = input.nextInt();
            System.out.print("İlk karakter için sütun tahmini: ");
            columnGuess1 = input.nextInt();

            cards[rowGuess1][columnGuess1].setGuess(true);
            gameBoard(cards);
            System.out.println("\n******************************\n");

            System.out.print("İkinci karakter için satır tahmini: ");
            rowGuess2 = input.nextInt();
            System.out.print("İkinci karakter için sütun tahmini: ");
            columnGuess2 = input.nextInt();
            cards[rowGuess2][columnGuess2].setGuess(true);
            gameBoard(cards);
            System.out.println("\n******************************\n");

            if(cards[rowGuess1][columnGuess1].getaChar() == cards[rowGuess2][columnGuess2].getaChar()){
                cards[rowGuess1][columnGuess1].setGuess(true);
                cards[rowGuess2][columnGuess2].setGuess(true);
                count++;
                gameBoard(cards);
                System.out.println("\n******************************\n");
            }else {
                cards[rowGuess1][columnGuess1].setGuess(false);
                cards[rowGuess2][columnGuess2].setGuess(false);
                gameBoard(cards);
                System.out.println("\nHatalı Tahmin!");
                System.out.println("\n******************************\n");
            }

            if (count == 8){
                System.out.println("\nOYUN TAMAMLANDI..:)");
                gameCase = false;
            }
        }while (gameCase);

        gameBoard(cards);
    }

    public static void gameBoard(Card[][] cards){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (cards[i][j].isGuess()){
                    System.out.print(cards[i][j].getaChar() + "\t");
                }else {
                    System.out.print("-" + "\t");
                }
            }
            System.out.println("");
        }
    }
}
