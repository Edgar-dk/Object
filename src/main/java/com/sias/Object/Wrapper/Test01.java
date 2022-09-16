package com.sias.Object.Wrapper;

import org.junit.jupiter.api.Test;

/**
 * @author Edgar
 * @create 2022-09-02 19:28
 * @faction:
 */
public class Test01 {
    public static void main(String[] args) {

        /*1.JDK5之前是需要手动的装箱和拆箱*/
        int a=100;
        Integer integer = Integer.valueOf(a);
        Integer integer2 = new Integer(a);

        /*01.拆箱*/
        int i = integer.intValue();
        System.out.println(a);

        double d =1d;

        /*2.自动装箱和拆箱子
        *   其实下面的方法，底层还是调用了上面的
        *   方法，去执行的，只是Java去帮助我们去执行了
        *   */
        int aa=1000;
        Integer integer1 = aa;

        int f= integer1;

    }

    @Test
    public void te(){

        /*1.Int--->String
        *   本质上，先把基本类型的数据，转换成
        *   包装类就是装箱，在Jdk5之前，是自动完成的*/
        Integer i=1000;
        String st = i + "";
        String s = i.toString();
        String s1 = String.valueOf(i);

        System.out.println(s1.getClass());
        System.out.println(s.getClass());
        System.out.println(st.getClass());

        /*2.String---->int*/
        String is ="232342";
        int i1 = Integer.parseInt(is);
        Integer integer = Integer.valueOf(is);
        Test01 test01 = new Test01();
        String s2 = test01.toString();
        System.out.println(s2);
    }
}
