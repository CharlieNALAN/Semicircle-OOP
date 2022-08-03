package cn.banyuan.biz;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    public void menu1(){
        System.out.println("******欢迎使用嗖嗖移动业务大厅******");
        System.out.println("1.用户登录 2.用户注册 3.使用嗖嗖 4.话费充值 5.资费说明 6.退出系统");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("运行用户登录");
                break;
            case 2:
                System.out.println("运行用户注册");
                break;
            case 3:
                System.out.println("运行使用嗖嗖");
                break;
            case 4:
                System.out.println("运行话费充值");
                break;
            case 5:
                System.out.println("运行资费说明");
                break;
            case 6:
                System.out.println("运行退出系统");
                break;
        }
    }


}
