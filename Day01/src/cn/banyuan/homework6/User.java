package cn.banyuan.homework6;

import java.util.Scanner;

public class User {
    String user;
    String password;

    public void changePwd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String newUser = sc.next();
        System.out.print("请输入密码:");
        String newPwd = sc.next();
        if(user.equals(newUser)&&password.equals(newPwd)){
            System.out.print("请输入新密码:");
            password = sc.next();
            System.out.println("修改完成，您的新密码为："+password);
        }else{
            System.out.println("用户名和密码不匹配！您没有权限更新!");
        }
    }
}
