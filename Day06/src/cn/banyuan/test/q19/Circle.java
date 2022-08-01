package cn.banyuan.test.q19;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double girth() {
        return 2*Math.PI*radius;
    }
}
