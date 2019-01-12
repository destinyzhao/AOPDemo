package com.example.aopdemo;

/**
 * @program aopdemo
 * @description:
 * @author: Destiny
 * @create: 2019/01/12 11:59
 */
public class HelloWorldImpl2 implements IHelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
    }
}

