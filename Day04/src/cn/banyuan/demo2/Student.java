package cn.banyuan.demo2;

import java.util.Objects;

public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
//        if(o instanceof Student){
//            Student s = (Student) o ;
//            return s.id == this.id && s.name.equals(this.name);
//        }
//        return false;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }
}
