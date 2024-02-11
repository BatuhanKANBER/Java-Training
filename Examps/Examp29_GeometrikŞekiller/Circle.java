package Examps.Examp29_GeometrikŞekiller;

public class Circle extends Shape{
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(this.diameter, 2));
    }
}
