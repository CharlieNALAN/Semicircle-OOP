package cn.banyuan.test.q24;

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary = salary;
    }

    @Override
    public double getSalary(int month) {
        return salary+super.getSalary(month);
    }
}
