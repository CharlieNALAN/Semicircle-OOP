package cn.banyuan.homework6;

public class Truck extends Car{
    private int payload;

    public Truck() {
    }

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                "} " + super.toString();
    }
}
