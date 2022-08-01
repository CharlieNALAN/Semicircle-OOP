package cn.banyuan.test.q24;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee(String name, int month, double sales, double rate, double baseSalary) {
        super(name, month, sales, rate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return baseSalary+super.getSalary(month);
    }
}
