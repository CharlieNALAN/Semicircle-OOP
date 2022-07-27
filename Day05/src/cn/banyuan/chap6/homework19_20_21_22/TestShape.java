package cn.banyuan.chap6.homework19_20_21_22;

public class TestShape {
    public static Shape getShape(int i){    //21
        if(i==0)
            return new Circle(1);
        else if(i==1)
            return new Rect(3,2);
        else
            return new Square(2);
    }

    public static void Print(Shape shape){  //22
        System.out.println(shape.area());
        System.out.println(shape.girth());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
//        System.out.println(circle.area());
        Rect rect = new Rect(3, 5);
//        System.out.println(rect.area());
        Square square = new Square(3);
//        System.out.println(square.area());

        Shape[] s = new Shape[3];
        s[0]=circle;
        s[1]=rect;
        s[2]=square;
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].area());
            System.out.println(s[i].girth());
        }

        Shape ss = getShape(2);
        System.out.println(ss.area());

        Print(ss);
    }
}
