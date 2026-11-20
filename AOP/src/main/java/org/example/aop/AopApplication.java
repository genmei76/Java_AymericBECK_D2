package org.example.aop;

import org.example.aop.model.Performance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext contexte = SpringApplication.run(AopApplication.class, args);

        Performance performance = contexte.getBean("concert", Performance.class);
        performance.perform();
    }

}
