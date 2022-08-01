package cn.banyuan.test.q24;

public class SalesEmployee extends Employee{
    private double sales;
    private double rate;

    public SalesEmployee(String name, int month, double sales, double rate) {
        super(name, month);
        this.sales = sales;
        this.rate = rate;
    }

    @Override
    public double getSalary(int month) {
        return  sales*rate + super.getSalary(month);
    }
}
