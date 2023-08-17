package com.yoxaron.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computerBean", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
