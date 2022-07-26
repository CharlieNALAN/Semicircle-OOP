package cn.banyuan.homework6;

public class Car extends Vehicle{
    private int loader;

    public Car() {
    }

    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                "} " + super.toString();
    }
}
