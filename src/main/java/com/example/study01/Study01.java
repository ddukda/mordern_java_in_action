package com.example.study01;

import org.springframework.stereotype.Service;

import java.util.*;

public class Study01 {

    public static List<Apple> sort (){
        List<Apple> appleList = new ArrayList<>();

        appleList.add(new Apple(5));
        appleList.add(new Apple(4));
        appleList.add(new Apple(2));
        appleList.add(new Apple(1));
        appleList.add(new Apple(4));

        Collections.sort(appleList, new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a1.compareTo(a2);
            }
        });

        return appleList;
    }

}

