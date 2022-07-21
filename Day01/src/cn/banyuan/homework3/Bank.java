package cn.banyuan.homework3;

public class Bank {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.address="aaa";
        c.phone="1111";
        c.id="11111";
        c.name="kkkk";
        Account ac = new Account();
        ac.cid = "1111";
        ac.balance = 111;
        ac.c = c;
        System.out.println(c.say());
        System.out.println(ac.getInfo());
    }
}
