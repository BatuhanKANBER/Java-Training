package Examps.Examp29_GeometrikŞekiller;

public class Square extends Shape{

    private int sideLen;

    public int getSideLen() {
        return sideLen;
    }

    public void setSideLen(int sideLen) {
        this.sideLen = sideLen;
    }

    public Square(int sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.pow(this.sideLen, 2));
    }
}
