package com.sias.Object.innerClass;

/**
 * @author Edgar
 * @create 2022-08-27 16:10
 * @faction:
 */
public class Test {
    public static void main(String[] args) {
        G(new FA() {
            @Override
            public void eat() {
                System.out.println("匿名内部类被调用了");
            }
        });
    }
    public static void G(FA fa){
        fa.eat();
    }
}

interface FA{
    public void eat();
}
