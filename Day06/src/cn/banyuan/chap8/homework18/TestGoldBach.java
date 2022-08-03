package cn.banyuan.chap8.homework18;

import java.util.Scanner;

interface MathTool{
    boolean isPrime(int n);
}


class MathToolImpl implements MathTool{

    public boolean isPrime(int n) {
        for(int i = 2; i<= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }

}


public class TestGoldBach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MathTool mt = new MathToolImpl();
        for(int i = 2; i<=n/2; i++){
            if (mt.isPrime(i) && mt.isPrime(n - i)){
                System.out.println(n+"="+ i+"+"+(n-i));
            }
        }
    }
}