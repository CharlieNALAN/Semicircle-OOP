package cn.banyuan.chap6.homework19_20_21_22;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
