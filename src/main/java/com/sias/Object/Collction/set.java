package com.sias.Object.Collction;

import java.util.HashSet;

/**
 * @author Edgar
 * @create 2022-10-06 17:25
 * @faction:
 */
public class set {
    public static void main(String[] args) {
        /*1.添加数据和取出来的数据不一样
        *   不能有重复的数据*/
        HashSet<Object> objects = new HashSet<>();
        objects.add("fg");
        objects.add("fg");
        objects.add("g");
        objects.add("p");
        System.out.println(objects);
    }
}
