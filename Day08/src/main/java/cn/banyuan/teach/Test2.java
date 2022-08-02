package cn.banyuan.teach;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.print("是否合格？（Y/N)");
        Scanner sc = new Scanner(System.in);
        String judge = sc.next();
        while("N".equals(judge)){
            System.out.println("上午阅读教材");
            System.out.println("下午上机编程");
            System.out.println("是否合格了？");
            judge = sc.next();
        }
        System.out.println("循环结束");
    }
}
