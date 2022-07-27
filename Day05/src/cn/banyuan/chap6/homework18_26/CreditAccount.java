package cn.banyuan.chap6.homework18_26;

public class CreditAccount extends Account{
    private double creditLine;

    public CreditAccount() {
    }

    public CreditAccount(long id, double balance, String password, double creditLine) {
        super(id, balance, password);
        this.creditLine = creditLine;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }
}
