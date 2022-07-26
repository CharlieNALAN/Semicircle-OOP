package cn.banyuan.homework8;

import java.util.Objects;

public class Student extends Person{
    private String id;

    public Student() {
    }

    public Student(String name, String sex, int age, String id) {
        super(name, sex, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id)&&this.getName().equals(student.getName());
    }


}
