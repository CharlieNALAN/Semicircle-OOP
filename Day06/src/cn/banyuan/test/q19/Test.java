package cn.banyuan.test.q19;

public class Test {

    public static Shape getShape(int i){
        if(i==0)
            return new Circle(1);
        else if(i==1)
            return new Rect(3,2);
        else
            return new Square(2);
    }

    public static void print(Shape shape){
        System.out.println(shape.area());
        System.out.println(shape.girth());
    }

    public static void main(String[] args) {
//        Square s = new Square(3);
//        System.out.println(s.area());
//        System.out.println(s.girth());
        Shape[] arr = new Shape[3];
        arr[0] = new Square(3);
        arr[1] = new Rect(1,2);
        arr[2] = new Circle(1);
        for(int i=0;i<3;i++){
            System.out.println(arr[i].area());
            System.out.println(arr[i].girth());
            System.out.println("-----------------------------");
        }

        Shape t1 = getShape(1);
        System.out.println(t1.area());

        print(t1);
    }
}
