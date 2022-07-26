package cn.banyuan.practice1;

public abstract class MotorVehicle {
    private String no;
    private String brand;
    private String color;
    private int mileage;

    public MotorVehicle(String no, String brand, String color, int mileage) {
        this.no = no;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public abstract int CalcRent(int days);
}
