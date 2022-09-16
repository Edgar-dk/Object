package com.sias.Object.Base;

/**
 * @author Edgar
 * @create 2022-08-07 21:48
 * @faction:
 */
public class ObjectUse {

    int age ;
    String name;

    public ObjectUse(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        ObjectUse use = new ObjectUse(12, "张三");
        System.out.println(use.name);
    }
}
