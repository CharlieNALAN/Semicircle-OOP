package cn.banyuan.homework5;

import java.util.Scanner;

public class Guset {
    String name;
    int age;

    public void price(){
        Scanner sc = new Scanner(System.in);

//        while(!"n".equals(name)){
//            Guset g = new Guset();
//            g.name=name;
//            g.age=age;
//            g.price();
//            System.out.print("请输入姓名：");
//            name=sc.next();
//            System.out.print("请输入年龄：");
//            age= sc.nextInt();
//        }
        do{
            System.out.print("请输入姓名：");
            String name1=sc.next();
            if("n".equals(name1)){
                break;
            }
            System.out.print("请输入年龄：");
            int age1= sc.nextInt();

            name=name1;
            age=age1;
            if(age>5)
                System.out.println(name+"的年龄为："+age+",门票价格为20元");
            else
                System.out.println(name+"的年龄为："+age+",门票免费");
        }while (true);
        System.out.println("退出程序");
    }
}
