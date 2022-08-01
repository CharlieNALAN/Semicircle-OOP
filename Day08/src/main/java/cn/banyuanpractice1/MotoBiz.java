package cn.banyuanpractice1;

import java.util.Scanner;

public class MotoBiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要查询的车牌号：");
        String no = sc.next();
        MotoTest test = new MotoTest();
        test.init();
        MotorVehicle vehicle = test.searchMoto(no);
        if(vehicle==null)
            System.out.println("找不到车");
        else{
            System.out.println(vehicle);

            System.out.println("----------------------------");
            System.out.print("输入要租天数:");
            int days = sc.nextInt();
            System.out.println("租金为："+vehicle.CalcRent(days));
        }

    }
}
