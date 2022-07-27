package cn.banyuan.chap6.homework18_26;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(111, 111, "123456");
        account.setPassword("111");
        account.setPassword("111111");
        System.out.println(account.getPassword());

        SavingAccount sa = new SavingAccount(111, 2222, "123456", 15);
        sa.setInterestRate(15);
        sa.setInterestRate(6);
        System.out.println(sa.getInterestRate());
    }
}
