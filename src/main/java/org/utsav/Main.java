package org.utsav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj = context.getBean(Alien.class);
        obj.code();

        Laptop laptop = context.getBean(Laptop.class);
        laptop.Compile();
    }
}