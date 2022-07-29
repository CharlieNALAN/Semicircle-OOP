package cn.banyuan.demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try{
            //执行可能产生异常的代码
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入被除数：");
            int n1=sc.nextInt();
            System.out.print("请输入除数：");
            int n2=sc.nextInt();
            int shang=n1/n2;
            System.out.println("商是："+shang);
        }catch (ArithmeticException e){
            //捕获异常 打印异常信息
            System.out.println("数学异常");
            e.printStackTrace();
            //打印异常信息
            // System.out.println(e.getMessage());

        }catch (InputMismatchException e){
            System.out.println("输入类型不匹配");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception。。。。");
            e.printStackTrace();
        }
        System.out.println("aaaaa");
    }

}
