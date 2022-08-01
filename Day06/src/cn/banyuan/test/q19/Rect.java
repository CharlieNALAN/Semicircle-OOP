package cn.banyuan.test.q19;

public class Rect extends Shape{
    private int length;
    private int width;

    public Rect(int length, int width) {
        this.length = length;
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
