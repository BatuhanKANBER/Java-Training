package Examps.Examp29_GeometrikŞekiller;

public class Triangle extends Shape{
    private int height;
    private int baseLen;

    public int getHeight() {
        return height;
    }

    public Triangle(int height, int baseLen) {
        this.height = height;
        this.baseLen = baseLen;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBaseLen() {
        return baseLen;
    }

    public void setBaseLen(int baseLen) {
        this.baseLen = baseLen;
    }

    @Override
    public float calculateArea() {
        return (float) ((this.baseLen * this.height) / 2);
    }
}
