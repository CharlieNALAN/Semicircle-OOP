package Test;

public class Demo {

}


class Super {
    public int get() {
        return 4;
    }
}

class Demo15 extends Super {
    public int get() {
        return 5;
    }

    public static void main(String[] args) {
        Super s = new Demo15();
        System.out.println(s.get());
    }
}
