package org.example.aop.model;

import org.springframework.stereotype.Component;


@Component
public class BadConcert implements Performance {
    @Override
    public void perform() {
        System.out.println("Bad Concert");
        throw new RuntimeException("oskour");
    }
}
