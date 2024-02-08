package Examps.Examp19_HafızaOyunu;

public class Card {
    private char aChar;
    private boolean guess = false;

    public Card(char aChar) {
        this.aChar = aChar;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public boolean isGuess() {
        return guess;
    }

    public void setGuess(boolean guess) {
        this.guess = guess;
    }
}
