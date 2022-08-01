package cn.banyuan.practice1;

public abstract class MotorVehicle {

    private String name;
    private String brand;
    private int rent;

    public MotorVehicle() {
    }

    public MotorVehicle( String name, String brand, int rent) {

        this.name = name;
        this.brand = brand;
        this.rent = rent;
    }



    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract double CalcRent(int days);

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", rent=" + rent +
                '}';
    }
}