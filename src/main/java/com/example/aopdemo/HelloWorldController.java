package com.example.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program aopdemo
 * @description:
 * @author: Destiny
 * @create: 2019/01/12 12:03
 */
public class HelloWorldController {
    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");

        IHelloWorld hw1 = (IHelloWorld)ctx.getBean("helloWorldImpl1");
        IHelloWorld hw2 = (IHelloWorld)ctx.getBean("helloWorldImpl2");

        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();
    }
}

