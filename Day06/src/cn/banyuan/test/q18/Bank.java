package cn.banyuan.test.q18;

public class Bank {
    public Account openAccount(long id, String password, int type){
        if(type==0){
            return new Account(id,0,password);
        }else if(type==1)
            return new SavingAccount(id,0,password,1.5);
        else
            return new CreditAccount(id,0,password,5);
    }

    public double deposit(Account a, double amount){
        a.setBalance(a.getBalance()+amount);
        return a.getBalance();
    }
    //    其中，a 表示取款账号，amount 表示取出的金额
    public double withdraw(Account a, double amount){
        if(a instanceof CreditAccount){
            a.setBalance(a.getBalance()-amount);
            return a.getBalance();
        }else{
            if(a.getBalance()>=amount){
                a.setBalance(a.getBalance()-amount);
                return a.getBalance();
            }else {
                System.out.println("钱不够取不出来");
                return a.getBalance();
            }

        }
    }

}
