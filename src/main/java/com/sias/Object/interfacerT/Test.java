package com.sias.Object.interfacerT;

/**
 * @author Edgar
 * @create 2022-08-27 9:09
 * @faction:
 */
public class Test {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        Test.t(mysql);

        Orccal orccal = new Orccal();
        t(orccal);
    }

    public static void t(Interfacer interfacer){
        /*1.传入的是整个对象，因此
        *   可以使用里面的方法，可以直接对象名去
        *   调用，其实底层创建了Interfacer这个对象*/
        interfacer.connect();
        interfacer.close();
    }
}
