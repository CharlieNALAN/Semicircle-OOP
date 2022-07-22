package cn.banyuan.demo1;

import java.util.Scanner;

public class Score {
    int javaScore;
    int csharpScore;
    int jsScore;


    public void setScore(){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入java成绩:");
        javaScore = sc.nextInt();
        System.out.print("输入C#绩:");
        csharpScore = sc.nextInt();
        System.out.print("输入JS成绩:");
        jsScore = sc.nextInt();
    }

    public int getSum(){
        return javaScore + csharpScore +jsScore;

    }
}
