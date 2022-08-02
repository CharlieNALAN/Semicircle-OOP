package cn.banyuan.practice1;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("歌词");
        String str="aaa bbb ccc ddd eee fff ggg hhh";
        System.out.println(str);
        String[] spt = str.split(" ");
        for(int i=0;i<spt.length;i++)
            System.out.println(spt[i]);
    }
}
