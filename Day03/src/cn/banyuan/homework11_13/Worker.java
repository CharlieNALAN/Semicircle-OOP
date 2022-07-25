package cn.banyuan.homework11_13;

import cn.banyuan.homework12.Address;

public class Worker {
    String name;
    int age;
    double salary;
    Address addr;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
        System.out.println("工作了一小时");
    }
    public void work(int hours){
        System.out.println("工作了"+hours+"小时");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", addr=" + addr +
                '}';
    }
}
