package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Edgar
 * @create 2022-09-20 16:11
 * @faction:
 */
public class ObjectInputTest {
    /*2.反序列化的方式去读取数据*/
    @Test
    public void read() throws IOException, ClassNotFoundException {
        String write = "d:\\write.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(write));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());

        Object dog = objectInputStream.readObject();
        System.out.println("运行类型："+dog.getClass());
        System.out.println("dog的信息："+dog);
        /*1.向下转型，才可以使得dog对象去调用里面的方法
        *   在调用这个方法的时候，需要。里面的序列化是最新的
        *   不向下转型的话，只能调用父类里面的方法，*/
        dog dog1 = (dog) dog;
        System.out.println(dog1.getI());
        objectInputStream.close();
    }
}
