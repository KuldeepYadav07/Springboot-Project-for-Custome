package com.springBoot.customAnnotation;

public class Test {

    @TestAnnotation(Developer="Rahul", Expirydate="01-10-2020")
    void fun1()
    {
        System.out.println("Test method 1");
    }

    @TestAnnotation()
    void fun2()
    {
        System.out.println("Test method 2");
    }
}
