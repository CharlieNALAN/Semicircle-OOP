package cn.banyuan.practice1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("***欢迎实用注册系统***");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("请输入用户名：");
            String user;
            String pwd;
            String pwdAgain;
            user = sc.next();
            System.out.print("请输入密码：");
            pwd=sc.next();
            System.out.print("请再次输入密码:");
            pwdAgain=sc.next();
            if(user.length()>=3&&pwd.equals(pwdAgain))
                break;
            System.out.println("用户名长度小于3或者密码不正确");
        }while (true);
        System.out.println("注册成功，请牢记用户名和密码");
    }
}
