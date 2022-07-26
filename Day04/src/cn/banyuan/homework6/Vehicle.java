package cn.banyuan.homework6;

public class Vehicle {
    private int wheels;
    private int weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, int weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
