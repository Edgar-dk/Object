package com.sias.Object.Base;

/**
 * @author Edgar
 * @create 2022-08-22 20:59
 * @faction:
 */
public class main {
    public main() {
        System.out.println("我是无参数的的构造器");
    }
    {
        System.out.println("我是普通的代码块");
    }
    public String  q=test();
    public static String name = "张三";




    static {
        System.out.println("我是静态代码块");
    }
    public static String test(){
        System.out.println("普通的方法被调用");
        return "sout";

    }
    public static void main(String[] args) {
        System.out.println("名字:"+name);
        main main = new main();
    }
}
