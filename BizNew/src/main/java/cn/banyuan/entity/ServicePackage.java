package cn.banyuan.entity;

public abstract class ServicePackage {
    public double price;

    public double getPrice() {
        return price;
    }

    public abstract void showInfo();
}
