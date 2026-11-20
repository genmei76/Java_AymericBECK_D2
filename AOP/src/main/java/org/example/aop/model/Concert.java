package org.example.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance {
    @Override
    public void perform() {
        System.out.println("Good concert");
    }
}
