package cn.banyuan.homework15;

public class TestComplex {
    public static void main(String[] args) {
        Complex a = new Complex(3, 5);
        Complex b = new Complex(4, 2);
        Complex c = a.add(b);
        System.out.println("("+a+")"+"+"+"("+b+")="+c);
        c=a.sub(b);
        System.out.println("("+a+")"+"-"+"("+b+")="+c);
        c=a.mul(b);
        System.out.println("("+a+")"+"*"+"("+b+")="+c);
        c=a.add(4);
        System.out.println("("+a+")"+"+"+"4="+c);
    }
}
