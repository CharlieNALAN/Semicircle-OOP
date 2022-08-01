package cn.banyuan.test.q24;

public class HourlyEmployee extends Employee{
    private double hourlySalary;
    private int hours;

    public HourlyEmployee(String name, int month, double hourlySalary, int hours) {
        super(name, month);
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }

    @Override
    public double getSalary(int month) {
        if(hours<=160)
            return hourlySalary*hours+super.getSalary(month);
        else
            return (hours-160)*1.5*hourlySalary+160*hourlySalary+super.getSalary(month);
    }
}
