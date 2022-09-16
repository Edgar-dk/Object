package com.sias.Object.innerClass;

/**
 * @author Edgar
 * @create 2022-08-27 16:38
 * @faction:
 */
public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.inner instance = a.getInstance();
        instance.ds();

        System.out.println("===================================");

        A.inner inner = a.new inner();
        inner.ds();
    }
}

class A{
    private int anInt =10;
    private void test(){
        System.out.println("外部类被调用"+anInt);
    }
    class inner{
        private int anInt=111;
        public void ds(){
            System.out.println("成员内部类被调用"+anInt+"+++++++"+A.this.anInt);
            test();
        }
    }
    public inner getInstance(){
        return new inner();
    }
}