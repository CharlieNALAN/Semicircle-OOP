package cn.banyuan.chap6.homework19_20_21_22;

public class Rect extends Shape{
    private double length;
    private double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rect() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double girth() {
        return 2*(length+width);
    }
}
