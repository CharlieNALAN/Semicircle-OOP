package cn.banyuan.test.q24;

public class Employee {
    private String name;
    private int month;

    public Employee() {
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public double getSalary(int month){
//        return 100;
        if(month==this.month)
            return 100;
        return 0;

    }
}
