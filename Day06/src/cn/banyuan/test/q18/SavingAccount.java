package cn.banyuan.test.q18;

public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(long id, double balance, String password, double interestRate) {
        super(id, balance, password);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate>0&&interestRate<10)
            this.interestRate = interestRate;
        else
            System.out.println("输入的利率不满足条件");
    }
}
