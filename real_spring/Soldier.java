package il.study.spring.real_spring;

import lombok.Data;

@Data
public class Soldier {
    private int age;
    private String name;
    private String secondName;

    public Soldier(int age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    public Soldier() {

    }

    public void printSoldierName () {
        System.out.println(this);
    }

}
