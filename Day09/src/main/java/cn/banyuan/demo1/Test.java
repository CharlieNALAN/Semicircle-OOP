package cn.banyuan.demo1;

public class Test {
    public static void main(String[] args) {
        Byte v1 = new Byte("21");
        Short v2 = new Short((short) 3);
        Integer v3 = new Integer(3);
        Long v4 = new Long(4);
        Float v5 = new Float(3.0);
        Double v6 = new Double(3.0);
        Character v7 = Character.valueOf('x');
        Boolean v8 = new Boolean(true);


        int i =Integer.parseInt("25");
        System.out.println(i);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
        System.out.println(v8);


        String a = new String("aaa");
        String b = new String("aaa");
        System.out.println(a==b);
    }
}
