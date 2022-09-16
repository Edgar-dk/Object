package com.sias.Object.String;

import org.junit.jupiter.api.Test;

/**
 * @author Edgar
 * @create 2022-09-07 17:50
 * @faction:
 */
public class test {
    public static void main(String[] args) {
        String a="dsf";
        String b=new String("dsf");
        System.out.println(a==b.intern());
    }
    @Test
    public void t(){
        String a="qp";
        String b="of";
        String c =a+b;
        String d ="qpof";
        System.out.println(c==d);
    }

    @Test
    public void r(){
        String name ="hangszanz";
//        System.out.println(name.equals("pp"));
        System.out.println(name.length());
        System.out.println(name.indexOf("z"));
        System.out.println(name.lastIndexOf("z"));
        System.out.println(name.substring(1,2));
        System.out.println(name.charAt(0));
    }

    @Test
    public void t2(){
        String name ="WC";
        String pc ="po";
        String po = "ke包斩风!格e个fdse";
        String s = name.toLowerCase();
        String s1 = pc.toUpperCase();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(name.concat("连接1").concat("L"));
        System.out.println(po.replace("e", "M"));
        String mo = "vr br et hnt we q";
        String[] s2 = mo.split(" ");
        for (String s3 : s2) {
            System.out.println(s3);
        }
        String ec ="faq";
        String et ="fd";
        System.out.println(ec.compareTo(et));
        String op ="un";
        int age =10;
        double fr=23.43222;
        char o ='男';
        System.out.println(String.format("我的名字是%s,年龄%d,得分%f,符号是%c", op, age, fr, o));
    }

}
