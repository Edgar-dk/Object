package com.sias.Object.Base1;

/**
 * @author Edgar
 * @create 2022-08-24 16:26
 * @faction:
 */
public class finalTest {
    public static void main(String[] args) {
        System.out.println(A.name);
    }
}

class A{
    static {
        System.out.println("static被执行");
    }
    public static String name="张三";

}
