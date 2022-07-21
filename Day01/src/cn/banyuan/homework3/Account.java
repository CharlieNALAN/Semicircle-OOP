package cn.banyuan.homework3;

public class Account {
    String cid;
    int balance;
    Customer c;

    public String getInfo(){
        return "卡号："+cid+",余额:"+balance+",所属用户"+c.name;
    }

    public void withdraw(){
        System.out.println("取钱成功");
    }

    public void save(){
        System.out.println("存钱成功");
    }
}
