package Examps.Examp29_GeometrikŞekiller;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(5, 8);
        Square square = new Square(28);

        System.out.println("Kare alan: " + square.calculateArea() + "\nÜçgen alan: " + triangle.calculateArea() + "\nDaire alan: " + circle.calculateArea());
    }
}
