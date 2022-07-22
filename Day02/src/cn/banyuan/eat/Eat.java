package cn.banyuan.eat;

import java.util.Scanner;

public class Eat {
    public static void main(String[] args) {
        System.out.println("欢迎使用\"吃货联盟订餐系统\"");
        Scanner sc = new Scanner(System.in);
        EatSystem eatSystem = new EatSystem();
        eatSystem.init();//初始化数据
        int choice;
        boolean isQuit =false;
        do{
            eatSystem.isFind=false;
            eatSystem.isAdd = false;
            eatSystem.isDel = false;
            eatSystem.display();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    eatSystem.order();
                    break;
                case 2:
                    eatSystem.look();
                    break;
                case 3:
                    eatSystem.check();
                    break;
                case 4:
                    eatSystem.delete();
                    break;
                case 5:
                    eatSystem.like();
                    break;
                case 6:
                    System.out.println("***6. 退出系统**");
                    isQuit = true;
                    break;
            }
        }while(!isQuit);
        System.out.println("谢谢使用");
    }

}
