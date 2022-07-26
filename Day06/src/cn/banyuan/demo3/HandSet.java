package cn.banyuan.demo3;

public abstract class HandSet {
    private String brand;
    private String type;

    public HandSet(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public HandSet() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public abstract void sendInfo();
    public abstract void call();
    public abstract void info();
}
