package com.sias.Object.innerClass;

/**
 * @author Edgar
 * @create 2022-08-27 17:08
 * @faction:
 */
public class staticInnerclass {
    public static void main(String[] args) {
        AA.inner inner = new AA.inner();
        inner.te();
    }
}

class AA{
    public static int a=1;
    public static void setA(){
        System.out.println("这个是外部static方法");
    }
    static class inner{
        public static int a=23;
        public  void te(){
            System.out.println("这个是static内部类"+AA.a);
            setA();
        }
    }
}