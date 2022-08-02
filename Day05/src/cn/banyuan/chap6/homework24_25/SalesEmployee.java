package cn.banyuan.chap6.homework24_25;

public class SalesEmployee extends Employee{
    private double sales;
    private double rate;

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int month, double sales, double rate) {
        super(name, month);
        this.sales = sales;
        this.rate = rate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+sales*rate+2000;
    }
}
