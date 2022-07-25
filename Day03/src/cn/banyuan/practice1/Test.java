package cn.banyuan.practice1;

public class Test {
    public static void main(String[] args) {
        Seller seller = new Seller();
        seller.setName("小王");
        Excelle[] cars = new Excelle[3];
        cars[0] = new Excelle("aaa","111");
        cars[1] = new Excelle("bbb", "222");
        cars[2] = new Excelle("ccc","333");
        Regal reg = new Regal("ddd", "444");
        seller.sell(reg);
        seller.sell(cars[0]);
        seller.sell(cars,3);
    }
}
