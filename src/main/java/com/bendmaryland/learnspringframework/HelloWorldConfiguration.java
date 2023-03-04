package com.bendmaryland.learnspringframework;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {

    record Person(String name, int age, Address address) {
    };

    record Address(String street, String city) {
    };

    @Bean
    public String name() {
        return "Ben";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person person() {
        return new Person("Maria", 24, new Address("Apple St", "philly"));
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Almond St", "Philadelpia");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Aardvark  St", "Russia");
    }

    @Bean
    public Person person2MethodCalls(String name, int age, Address address2) {
        return new Person(name(),age(), address() );
    }

    @Bean
    public Person person3Parameters() {
        return new Person(name(),age(), address3() );
    }

}
