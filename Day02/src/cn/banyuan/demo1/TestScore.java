package cn.banyuan.demo1;

public class TestScore {
    public static void main(String[] args) {
        Score score = new Score();
        score.setScore();
        System.out.println("总分是："+score.getSum());
    }
}
