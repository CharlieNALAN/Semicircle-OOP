package cn.banyuan.homework2;

public class Wife {
    String name;
    int age;
    Husband hb;

    public void getInfo(){
        System.out.println("姓名:"+name+",年龄："+age+"，丈夫姓名："
                +hb.name+"，丈夫年龄："+hb.age);
    }
}
