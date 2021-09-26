package com.example.demo.study01;

import org.junit.jupiter.api.Test;

import java.util.List;

class Study01Test {

//    @Autowired
//    Study01 study01;

    @Test
    public void compare() {
        List<Apple> appleList = Study01.sort();

        appleList.stream().forEach(apple -> System.out.println(apple.getWeight()));
    }

}
