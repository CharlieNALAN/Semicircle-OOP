package cn.banyuan.homework5;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("white", "a");
        Car c2 = new Car("white", "a");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
    }
}
