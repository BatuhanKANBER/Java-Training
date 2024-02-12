package Examps.Examp30_InnerClass;

public class Math {
    public float calculateArea(){
        return 0;
    }
    public class Square extends  Math{
        private int sideLen;

        public int getSideLen() {
            return sideLen;
        }

        public void setSideLen(int sideLen) {
            this.sideLen = sideLen;
        }

        @Override
        public float calculateArea() {
            return (float) java.lang.Math.pow(getSideLen(), 2);
        }
    }

    public class Circle extends Math{
        private float radius;

        public float getRadius() {
            return radius;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        @Override
        public float calculateArea() {
            return (float) (java.lang.Math.PI * java.lang.Math.pow(getRadius(), 2));
        }
    }
}
