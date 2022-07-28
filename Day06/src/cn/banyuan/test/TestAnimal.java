package cn.banyuan.test;

class Animal{
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
    //2
}
class Cat extends Animal{
//3

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}
public class TestAnimal{
    public static void main(String args[]){
        Animal[] as = new Animal[]{
                new Dog("Pluto"),
                new Cat("Tom"),
                new Dog("Snoopy"),
                new Cat("Garfield")
        };
        Dog[] dogs = getAllDog(as);
        for(int i = 0; i<dogs.length; i++){
            System.out.println(dogs[i].getName());
        }
    }
    public static Dog[] getAllDog(Animal[] as){
//4
        Dog[] temp = new Dog[2];
        int index=0;
        for(int i=0;i<as.length;i++){
            if(as[i] instanceof Dog){
                temp[index++]=(Dog)as[i];
            }
        }
        return temp;
    }
}
