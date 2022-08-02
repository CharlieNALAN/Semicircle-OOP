package cn.banyuan.teach;

public class Hello {
    public static void main(String[] args) {
        int count =1; //记录你打印了多少分试卷
        while(count<=50){       //括号里的内容  -> 循环条件
            /**
             * 循环条件为真才会进入循环操作
             */
            System.out.println("打印的第"+count+"分试卷");     //循环操作
            count++;
        }
        System.out.println("循环结束");
    }
}
