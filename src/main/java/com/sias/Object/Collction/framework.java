package com.sias.Object.Collction;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Edgar
 * @create 2022-10-02 19:15
 * @faction:
 */
public class framework {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("fss");
        objects.add("fgg");
        objects.add("ghfd");
        objects.add("jd");

        /*1.只要是继承了Collection接口的方法，
        *   里面都含有iterator方法，用来遍历数据用的
        *   先hasNext判断下面还有没有数据，有的话，在执行next，从
        *   下面地方把数据取出来，直到while后面执行的是false，
        *   才不往下面执行*/
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
