package cn.banyuan.practice2;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s1 = sc.next();
        StringBuffer s2 = new StringBuffer(s1);
        for(int i=s2.length()-3;i>0;i-=3){
            s2.insert(i,",");
        }
        System.out.println(s2);


        Random random = new Random();
        int rand = (int) (Math.random()*10);
        System.out.println(rand);
        for(int i=0;i<10;i++){
            rand = random.nextInt(10);
            System.out.println(rand);
        }
    }
}
