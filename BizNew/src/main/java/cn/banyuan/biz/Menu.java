package cn.banyuan.biz;

import cn.banyuan.entity.*;
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
                        while(!tool.isExistCard(number,password)){
                            System.out.print("密码错误重新输入：");
                            password = sc.next();
                        }
                        menu1(number);
                    }else
                        System.out.println("手机号不存在");
                    break;
                case 2:
                    menu2();
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
                    System.out.println("谢谢使用");
                    return;
            }
        }while (true);

    }

    public void menu1(String number){
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
                    System.out.println("****本月账单查询****");
                    tool.billQuery(number);
                    break;
                case 2:
//                    System.out.println("运行套餐余量查询");

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

    public void menu2(){
        String[] num = tool.getNewNumbers(9);
        System.out.println("****可选择的卡号****");
        for(int i=0;i<9;i++){
            System.out.print((i+1)+"."+num[i]+"\t");
            if((i+1)%3==0)
                System.out.println();
        }
        MobileCard newCard = new MobileCard();     //新电话卡
        System.out.print("请选择卡号：");
        int cardChoice = sc.nextInt();
        while(cardChoice<1||cardChoice>9){
            System.out.println("输入有误，重新输入");
            cardChoice = sc.nextInt();
        }
        System.out.print("1.话痨套餐  2.网虫套餐  3.超人套餐  请选择套餐：");
        ServicePackage sp = null;                 //套餐选择
        int packageChoice = sc.nextInt();
        switch(packageChoice){
            case 1:
                sp = new TalkPackage();
                break;
            case 2:
                sp = new NetPackage();
                break;
            case 3:
            default:
                sp = new SuperPackage();
                break;
        }
        String number = num[cardChoice-1];  //电话号码
        System.out.print("请输入姓名:");
        String name = sc.next();            //名字
        System.out.print("请输入密码：");
        String pwd = sc.next();             //密码
        System.out.print("请输入预存话费金额：");
        double money = sc.nextDouble();
        while(money<sp.price){
            System.out.print("预留话费不足本月固定套餐，重新输入:");
            money = sc.nextDouble();
        }
        money-= sp.getPrice();
        newCard.setUserName(name);
        newCard.setPassWord(pwd);
        newCard.setMoney(money);
        newCard.setCardNumber(number);
        newCard.setSerPackage(sp);
        newCard.setConsumAmount(sp.price);
        tool.addCard(newCard);
        System.out.println("注册成功！卡号："+number+"  用户名："+name+"  当前余额："+money+"元。");
        sp.showInfo();
    }
}
