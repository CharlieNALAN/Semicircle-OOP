package cn.banyuan.chap6.homework24_25;

public class HourlyEmployee extends Employee{
    private double hourlySalary;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int month, double hourlySalary, int hour) {
        super(name, month);
        this.hourlySalary = hourlySalary;
        this.hour = hour;
    }

    @Override
    public double getSalary(int month) {
//        return super.getSalary(month);
        int sum=0;
        if(hour<=160)
            return hour*hourlySalary+super.getSalary(month);
        else
            return (hour-160)*1.5*hourlySalary+160*hourlySalary+super.getSalary(month);
    }
}
