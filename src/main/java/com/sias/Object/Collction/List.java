package com.sias.Object.Collction;

import java.util.ArrayList;

/**
 * @author Edgar
 * @create 2022-10-04 9:30
 * @faction:
 */
public class List {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("fds");
        objects.add("fdhfdh");
        objects.add("fdh");
        objects.add("fdohhk");
        objects.add("fdohhk");
        /*1.放进去的数据按照这种形式
        *   进去，取出数据也是按照这种顺序来的
        *   ，数据可以重复*/
        System.out.println(objects);
        System.out.println(objects.get(1));
        /*2.在索引为1（数据2的位置山）的位置上添加一个数据，以前的那个数据往后移动*/
        objects.add(1,"ppp");
        System.out.println(objects);
        /*3.第一次和最后一次出现的位置，索引位置*/
        System.out.println(objects.indexOf("fdohhk"));
        System.out.println(objects.lastIndexOf("fdohhk"));
        /*4.移除索引位置上的元素*/
        objects.remove(0);
        System.out.println(objects);
        /*5.修改所以位置上的元素*/
        objects.set(1,"ooooo");
        System.out.println(objects);
    }
}
