package cn.banyuan.demo1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.print("请输入课程代号（1~3之间):");
        try {
            Scanner sc = new Scanner(System.in);
            String[] tmp = {"aaa","bbb","ccc"};
            int a = sc.nextInt();
            System.out.println(tmp[a-1]);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }
    }
}
