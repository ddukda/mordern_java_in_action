package com.example.study01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apple implements Comparable<Apple> {
    private int weight;

    @Override
    public int compareTo(Apple o) {
        if (this.weight < o.getWeight()) {
            return -1;
        } else if (this.weight > o.getWeight()) {
            return 1;
        }
        return 0;
    }
}
