package com.sias.Object.Base;

import javax.swing.text.rtf.RTFEditorKit;

/**
 * @author Edgar
 * @create 2022-08-12 10:37
 * @faction:
 */
public class Base {
    public int age;
    public String name;
    String sex="ds";

    /*public Base() {
        System.out.println("Base() 无参数的构造器被调用");
    }*/

    public Base(int age, String name, String sex) {
        System.out.println("Base(int age, String name, String sex) 有参数的构造器被调用");
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("私有属性sex，被调用");
        this.sex = sex;
    }

    public void test01(){
        test();
    }
    private int test(){
        int a= 2;
        return a;
    }
}
