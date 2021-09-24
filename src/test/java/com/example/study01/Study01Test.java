package com.example.study01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Study01Test {

//    @Autowired
//    Study01 study01;

    @Test
    public void compare() {
        List<Apple> appleList = Study01.sort();

        appleList.stream().forEach(apple -> System.out.println(apple.getWeight()));
    }

}
