package cn.banyuan.chap6.homework18_26;

public class Bank {
    public Account openAccount(long id, String password, int type){
        if(type==0)
            return new Account(id,0,password);
        else if(type==1)
            return new SavingAccount(id,0,password,6);
        else
            return new CreditAccount(id,0,password,100);
    }

    public double deposit(Account a,double amount){
        a.setBalance(a.getBalance()+amount);
        return a.getBalance();
    }

    public double withdraw(Account a,double amount){
        if(a.getBalance()>amount){
            a.setBalance(a.getBalance()-amount);
            return a.getBalance();
        }else{
            if(a instanceof CreditAccount){
                a.setBalance(a.getBalance()-amount);
                return a.getBalance();
            }
            else {
                System.out.println("余额不足");
                return a.getBalance();
            }
        }
    }
}
