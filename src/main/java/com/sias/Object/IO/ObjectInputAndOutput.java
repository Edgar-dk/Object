package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author Edgar
 * @create 2022-09-20 14:54
 * @faction:
 */
public class ObjectInputAndOutput {
    /*1.序列化的方式去存储数据*/
    @Test
    public void Write() throws IOException {
        /*0.保存数据的话，需要序列化，因此
        *   保存数据的文本格式也是需要变化的*/
        String write = "d:\\write.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(write));
        /*1.底层自动帮助我们把int类型的数据转换成Inteager类型的数据
        *   下面boolean也是转换成对象类型的数据*/
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeObject(new dog(1,"山东"));
        objectOutputStream.close();
    }


}

