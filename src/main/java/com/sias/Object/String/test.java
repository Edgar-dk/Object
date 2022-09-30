package com.sias.Object.String;

import org.junit.jupiter.api.Test;

/**
 * @author Edgar
 * @create 2022-09-07 17:50
 * @faction:
 */
public class test {
    public static void main(String[] args) {
        String a = "dsf";
        String b = new String("dsf");
        System.out.println(a == b.intern());
        String add = "abcdef";
        System.out.println(test.exchange(add, 1, 4));
//        System.out.println(test.TrueOrFalse("fgdg", "g334bv", "gfg@gd."));
        test.location("godez gdsnf hhhhh");
    }

    @Test
    public void t() {
        String a = "qp";
        String b = "of";
        String c = a + b;
        String d = "qpof";
        System.out.println(c == d);
    }

    @Test
    public void r() {
        String name = "hangszanz";
//        System.out.println(name.equals("pp"));
        System.out.println(name.length());
        System.out.println(name.indexOf("z"));
        System.out.println(name.lastIndexOf("z"));
        System.out.println(name.substring(1, 2));
        System.out.println(name.charAt(0));
    }

    @Test
    public void t2() {
        String name = "WC";
        String pc = "po";
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
        String ec = "faq";
        String et = "fd";
        System.out.println(ec.compareTo(et));
        String op = "un";
        int age = 10;
        double fr = 23.43222;
        char o = '男';
        System.out.println(String.format("我的名字是%s,年龄%d,得分%f,符号是%c", op, age, fr, o));
    }

    /*1.实现字符串之间的字符反转*/
    public static String exchange(String arr, int start, int end) {

        if (!(arr != null && start < end && end < arr.length())) {
            throw new RuntimeException("参数不正确");
        }

        /*01.其实这个是用最简单的交换方式的思想去实现
         *    然后在学习一些复杂性的只是，最后在综合使用*/
        char[] chars = arr.toCharArray();
        char emp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            emp = chars[i];
            chars[i] = chars[j];
            chars[j] = emp;
        }
        return new String(chars);
    }

    /*2.用户邮箱验证*/
    public static String TrueOrFalse(String name, String password, String qq) {
        int length = name.length();
        if (!(length >= 2 && length <= 4)) {
            /*1.只有上面数据的格式不正确的话，才执行括号里面的*/
            throw new RuntimeException("用户名长度不对");
        }
        if (!(password.length() == 6 && test.figure(password))) {
            throw new RuntimeException("输入的数据格式不正确");
        }
        int i = qq.indexOf('@');
        int i1 = qq.indexOf('.');
        if (!(i > 0 && i1 > i)) {
            throw new RuntimeException("邮箱中包含@和.以及@需要在.之前");
        }
        return "成功";
    }

    public static boolean figure(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] > '0' && chars[i] < '9')) {
                return false;
            }
        }
        return true;
    }

    /*3.数据位置转换*/
    public static void location(String name) {
        if (name == null) {
            System.out.println("输入的数据不能为空");
            return;
        }
        String[] split = name.split(" ");
        if (split.length != 3) {
            System.out.println("输入的数据格式不正确");
            return;
        }

        /*1.charAt是获取一个字符串第第一个位置上的数据*/
        String format = String.format("%s,%s.%c", split[2], split[0], split[1].toUpperCase().charAt(0));
        System.out.println(format);
    }


}
