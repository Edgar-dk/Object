package com.sias.Object.Collction;

import java.util.ArrayList;

/**
 * @author Edgar
 * @create 2022-10-04 10:02
 * @faction:
 */
public class ListSort {
    private static ArrayList<Object> objects;
    public static void main(String[] args) {
        objects = new ArrayList<>();
        objects.add(new Book("三国", 99, "罗贯中"));
        objects.add(new Book("水浒传", 100, "施耐恩"));
        objects.add(new Book("西游记", 45, "吴承恩"));
        sort();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
    public static void sort(){
        for (int i = 0; i < objects.size() - 1; i++) {
            for (int j = 0; j < objects.size() - 1 - i; j++) {
                /*1.在集合里面存放的是，对象
                *   用两个for使用索引，下面是把索引放在想要取出来的
                *   数据地方，数据获得之后，按照数据类型，去返回
                *   到这个类型里面然后在判断数据，里面的值，条件成立的话
                *   交换两个数据，不成立，比较好，使用的是向下转型*/
                Book book = (Book) objects.get(j);
                Book book1 = (Book) objects.get(j+1);
                if (book.getPrice()>book1.getPrice()){
                    objects.set(j,book1);
                    objects.set(j+1,book);
                }
            }
        }

    }
}

