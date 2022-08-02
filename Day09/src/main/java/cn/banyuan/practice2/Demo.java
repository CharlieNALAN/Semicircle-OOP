package cn.banyuan.practice2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("*****欢迎进入提交作业系统*****");
        Scanner sc=new Scanner(System.in);


        System.out.print("请输入java文件名：");
        String javaName=sc.next();
        System.out.print("请输入邮箱名：");
        String emailName=sc.next();
        javaName= javaName.trim();
        emailName=emailName.trim();

        boolean jn=false;
        /*文件名是 最后一个 点后面是java*/

        if(
                javaName.indexOf(".")!=-1
                && javaName.substring(javaName.lastIndexOf(".")).equals(".java")
                &&javaName.lastIndexOf(".")!=0){
            jn=true;
            System.out.println("名称成功");
        }else{
            jn=false;
            System.out.println("名称失败");
        }
        boolean en=false;
//        if(emailName.indexOf("@")!=-1 && emailName.indexOf(".")!=-1 && emailName.indexOf(".")>emailName.indexOf("@")){
//            en=true;
//            System.out.println("邮箱成功");
//        }else{
//            en=false;
//            System.out.println("邮箱失败");
//        }

        if(emailName.indexOf("@")!=-1 &&
                emailName.indexOf(".")!=-1 &&
                emailName.indexOf(".")>emailName.indexOf("@") &&
                emailName.indexOf("@")+1!=emailName.indexOf(".")){
            en = true;
            System.out.println("邮箱正确");
        }else{
            en = false ;
            System.out.println("邮箱失败");
        }
        if(jn && en){
            System.out.println("作业提交成功");
        }else {
            System.out.println("作业提交失败");
        }

    }
}
