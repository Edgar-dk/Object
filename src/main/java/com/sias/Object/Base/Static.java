package com.sias.Object.Base;

/**
 * @author Edgar
 * @create 2022-08-23 20:21
 * @faction:
 */
public class Static {

    public static void main(String[] args) {
        B b = new B();
    }
}


class A{
    {
        System.out.println("A的普通代码块");
    }
    static {
        System.out.println("A的静态代码块");
    }
    public A() {
        System.out.println("A的构造器");
    }
}

class B extends A{
    {
        System.out.println("B的静态代码块");
    }
    public B() {
        System.out.println("B的构造器");
    }
}