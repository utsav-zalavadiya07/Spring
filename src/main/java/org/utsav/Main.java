package org.utsav;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.age=21;
        System.out.println(obj1.age); //21
        obj1.code();

        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);  // 0

        obj2.code();

        Laptop laptop = (Laptop) context.getBean(Laptop.class);
        laptop.Compile();
    }
}