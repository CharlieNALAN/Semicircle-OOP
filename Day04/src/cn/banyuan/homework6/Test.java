package cn.banyuan.homework6;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, 10);
        System.out.println(vehicle);
        Car car = new Car(4, 20, 4);
        System.out.println(car);
        Truck truck = new Truck(8, 100, 4, 60);
        System.out.println(truck);
    }
}
