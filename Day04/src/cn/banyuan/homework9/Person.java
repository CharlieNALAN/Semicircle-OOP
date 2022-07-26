package cn.banyuan.homework9;

import java.util.Objects;

public class Person {
    private String name;
    private int height;
    private String weapon;
    private String race;

    public Person() {
    }

    public Person(String name, int height, String weapon, String race) {
        this.name = name;
        this.height = height;
        this.weapon = weapon;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "姓名:"+name+",种族："+race;
    }

    public void skill(){
        switch (name){
            case "sunwukong":
                System.out.println("七十二变");
                break;
            case "tangseng":
                System.out.println("紧箍咒");
                break;
            case "baigujing":
                System.out.println("九阴白骨爪");
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(race, person.race);
    }


}
