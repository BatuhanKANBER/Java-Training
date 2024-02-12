package Examps.Examp30_InnerClass;

public class Main {
    public static void main(String[] args) {
        Math.Square square = new Math().new Square();
        Math.Circle circle = new Math().new Circle();

        square.setSideLen(10);
        circle.setRadius(10);

        System.out.println("Karenın alanı: " + square.calculateArea());
        System.out.println("Dairenin alanı: " + circle.calculateArea());
    }
}
