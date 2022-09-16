package com.sias.Object.interfacerT;

/**
 * @author Edgar
 * @create 2022-08-27 9:11
 * @faction:
 */
public class Orccal implements Interfacer{
    @Override
    public void connect() {
        System.out.println("连接上了Orccal");
    }

    @Override
    public void close() {
        System.out.println("关闭了Orccal");
    }
}
