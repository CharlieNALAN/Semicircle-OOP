package cn.banyuan.chap6.homework24_25;

public class Employee {
    private String name;
    private int month;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public Employee() {
    }

    public double getSalary(int month){
        if(this.month==month)
            return 100;
        return 0;
    }
}
