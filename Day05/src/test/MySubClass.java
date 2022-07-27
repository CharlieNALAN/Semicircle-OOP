package test;

class MySubClass extends MyClass{
    public MySubClass(int value){
        this.value = value;
    }

    public static void main(String[] args) {
        MySubClass mySubClass = new MySubClass(10);
    }
}