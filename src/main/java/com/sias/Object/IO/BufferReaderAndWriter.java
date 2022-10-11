package com.sias.Object.IO;

import javafx.scene.layout.BorderImage;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author Edgar
 * @create 2022-09-19 20:38
 * @faction:
 */
public class BufferReaderAndWriter {
    /*1.读取文本中的数据*/
    public static void main(String[] args) throws IOException {

        String BufferReader = "D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\WriterAndReader.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(BufferReader));
        String line;
        /*1.只要是读取的数据，不为空，就可以一直读取数据
        *   读取的数据，放在line里面，然后输出，在往下面继续读取数据
        *   读取一行数据，这一行数据，就放在string类型的字符串里面*/
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        /*2.只需要在外部关闭，其实
        *   内部是按照构造器参数中传递进去的参数类型关闭的*/
        bufferedReader.close();
    }

    /*2.写入文本数据*/
    @Test
    public void write() throws IOException {
        String write = "D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\writer.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(write,true));
        String writeContent = "春飞十里只等闲";
        bufferedWriter.write(writeContent);
        bufferedWriter.close();
    }
}
