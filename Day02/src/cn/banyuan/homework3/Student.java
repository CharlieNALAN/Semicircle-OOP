package cn.banyuan.homework3;

public class Student {
    String name;
    int age;
    double score;
    static Student[] students = new Student[10];
    int total = 0;

    public void addStudent(String name,int age,double score){
        Student st = new Student();
        st.name = name;
        st.age  = age;
        st.score = score;
        students[total++] = st;
    }

    public void showStudent(){
        for(int i=0;i<total;i++){
            System.out.println("name:"+students[i].name+",age:"+students[i].age+",score:"+students[i].score);
        }
    }
}
