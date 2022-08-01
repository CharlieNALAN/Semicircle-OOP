package cn.banyuan.test.q18;

public class Test {
    public static void main(String[] args) {
//        CreditAccount creditAccount = new CreditAccount(111, 2999, "111111", 10);
//        SavingAccount savingAccount = new SavingAccount(222, 3333, "222222", 7);
//        savingAccount.setPassword("123456");
//        System.out.println(savingAccount.getPassword());
//        savingAccount.setInterestRate(8);
//        System.out.println(savingAccount.getInterestRate());
        Bank bank = new Bank();
        Account a = bank.openAccount(123, "123456", 2);
        System.out.println(bank.deposit(a,100));
        System.out.println(bank.withdraw(a,120));

    }

}
