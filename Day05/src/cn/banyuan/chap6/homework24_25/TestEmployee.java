package cn.banyuan.chap6.homework24_25;

public class TestEmployee {
    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee("aaa", 3, 1000);
        HourlyEmployee e2 = new HourlyEmployee("bbb", 4, 10, 100);
        SalesEmployee e3 = new SalesEmployee("ccc", 5, 300, 2);
        BasePlusSalesEmployee e4 = new BasePlusSalesEmployee("ddd", 6, 100, 1, 800);

        Employee[] team = new Employee[4];
        team[0]=e1;
        team[1]=e2;
        team[2]=e3;
        team[3]=e4;
        for(int i=0;i<4;i++){
            System.out.println("salary="+team[i].getSalary(4));
        }
    }
}
