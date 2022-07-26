package cn.banyuan.practice1;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("111", "别克", "G1");
        System.out.println(car.CalcRent(5));
        Bus bus = new Bus("111", 17);
        System.out.println(bus.CalcRent(5));
    }
}
