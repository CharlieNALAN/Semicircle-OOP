package cn.banyuan.chap6.homework24_25;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(String name, int month, double sales, double rate, double baseSalary) {
        super(name, month, sales, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+baseSalary;
    }
}
