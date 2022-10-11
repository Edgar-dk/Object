package com.sias.Object.Collction;

import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;

/**
 * @author Edgar
 * @create 2022-10-04 9:45
 * @faction:
 */
public class ListPricest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("hello");
        objects.add("tom");
        objects.add("jack");
        objects.add("lusi");
        objects.add("zhangsan");
        objects.add("张三丰");
        objects.add("张三");
        objects.add("王五");
        objects.add("赵六");
        objects.add("麻子");
        objects.add(1,"韩顺平教育");
        System.out.println(objects.get(4));
        objects.remove(5);
        objects.set(6,"mmmmmmmmmm");
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
