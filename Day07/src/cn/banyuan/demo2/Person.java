package cn.banyuan.demo2;

public class Person {
    private String sex;

    public Person(String sex){
        if("男".equals(sex)||"女".equals(sex))
            this.sex = sex;
        else{

            try {
                throw new Exception("1111");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
