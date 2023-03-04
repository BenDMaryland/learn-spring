package com.bendmaryland.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Configuration;

@Configuration
public class App002HelloWorldSpring {

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCalls"));
        System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean(HelloWorldConfiguration.Address.class));
    }


}
