package org.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.aop.model.Performance;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience
{

    @Pointcut("execution( * org.example.aop.model.Performance.perform(..))\"")
    void performance(){}


/*
    @Before("performance()")
    void silenceCellphone()
    {
        System.out.println("TAI-SEZ VOUS");
    }

    @AfterReturning("performance()")
    void applause()
    {
        System.out.println("Good job");
    }

    @AfterThrowing("performance()")
    void angry()
    {
        System.out.println("was thrown");
    }

    @After("performance()")
    void leaving()
    {
        System.out.println("aqgoijmkp");
    }

 */
    @Around("performance()")
    void watchPerformance(ProceedingJoinPoint jointPoint) throws Throwable
    {
        try {
            System.out.println("TAI-SEZ VOUS");

            //method call
            //jointPoint.proceed();

            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("was thrown");
        } finally {
            System.out.println("aqgoijmkp");
        }
    }
}
