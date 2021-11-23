package com.example.test2;

import org.springframework.stereotype.Component;


@Component("newMethod")
public class Method{
    public double getWeight(int newlevel, int newindex, Double weight) {
        if (newlevel == 0) {
            return 0.0;
        } else if (newindex == 0) {
            return (getWeight(newlevel - 1, newindex, weight) + weight) / 2;
        } else if (newindex == newlevel) {
            return (getWeight(newlevel - 1, newindex - 1, weight) + weight) / 2;
        } else {
            return weight + (getWeight(newlevel - 1, newindex - 1, weight) / 2) + (getWeight(newlevel - 1, newindex, weight) / 2);
        }
    }
}