package cn.banyuan.chap6.homework18_26;

public class Account {
    private long id;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(long id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String password) {
        if(password.length()==6)
            this.password=password;
        else
            System.out.println("输入有误，不予修改");
    }
}
