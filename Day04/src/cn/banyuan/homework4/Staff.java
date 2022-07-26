package cn.banyuan.homework4;

public class Staff extends Employee{
    private String duty;

    public Staff(String duty) {
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
