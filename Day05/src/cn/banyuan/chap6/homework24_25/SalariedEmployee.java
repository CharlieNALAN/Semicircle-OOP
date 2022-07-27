package cn.banyuan.chap6.homework24_25;

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+salary;
    }
}
