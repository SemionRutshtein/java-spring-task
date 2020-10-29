package il.study.spring.real_spring;

import lombok.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class Soldier {
    private int age;

    public void setAge(String age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
