package cn.banyuan.biz;

import cn.banyuan.tools.CardUtil;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    CardUtil tool;

    public Menu() {
        tool = new CardUtil();
        tool.initScene();
    }

    public void menu(){
        do{
            System.out.println("******欢迎使用嗖嗖移动业务大厅******");
            System.out.println("1.用户登录 2.用户注册 3.使用嗖嗖 4.话费充值 5.资费说明 6.退出系统");
            System.out.print("请输入：");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("请输入手机卡号：");
                    String number = sc.next();
                    if(tool.isExistCard(number)){
                        System.out.print("请输入密码：");
                        String password = sc.next();
//                        if(tool.isExistCard(number,password)){
//                            menu1();
//                        }
                        while(!tool.isExistCard(number,password)){
                            System.out.print("密码错误重新输入：");
                            password = sc.next();
                        }
                        menu1();
                    }else
                        System.out.println("手机号不存在");
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
        }while (true);

    }

    public void menu1(){
        do{
            System.out.println("*****嗖嗖移动用户菜单*****");
            System.out.println("1.本月账单查询");
            System.out.println("2.套餐余量查询");
            System.out.println("3.打印消费详情");
            System.out.println("4.套餐变更");
            System.out.println("5.办理退网");
            System.out.println("请选择（输入1~5选择功能，其他键返回上一级）");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("运行本月账单查询");
                    break;
                case 2:
                    System.out.println("运行套餐余量查询");
                    break;
                case 3:
                    System.out.println("运行打印消费详情");
                    break;
                case 4:
                    System.out.println("运行套餐变更");
                    break;
                case 5:
                    System.out.println("运行办理退网");
                    break;
                default:
                    return;
            }
        }while(true);
    }


}
