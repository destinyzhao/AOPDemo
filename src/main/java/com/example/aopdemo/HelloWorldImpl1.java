package com.example.aopdemo;

/**
 * @program aopdemo
 * @description:
 * @author: Destiny
 * @create: 2019/01/12 11:58
 */
public class HelloWorldImpl1 implements IHelloWorld{

    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
    }
}

