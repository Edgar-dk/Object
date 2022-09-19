package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Edgar
 * @create 2022-09-18 21:31
 * @faction:
 */
public class WriterAndReader {
    /*1.多个字符的读取*/
    public static void main(String[] args) throws IOException {
        String reader = "D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\reader.txt";
        FileReader fileReader = new FileReader(reader);
        int len ;
        char[] chars = new char[256];
        while ((len=fileReader.read(chars))!=-1){
            String read = new String(chars,0,len);
            System.out.println(read);
        }
        fileReader.close();
    }

    /*2.单个字符的读取*/
    @Test
    public void readFirst() throws IOException{
        String reader = "D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\reader.txt";
        FileReader fileReader = new FileReader(reader);
        int data;
        /*1.一个一个字符串去读取数据，过来的数据也是字符形式的，只是这中
        *   字符是数字形式的例如一个a数字形式的是102，这个只是一个举例，
        *   还需要把这个转换成字符，最后才可以输出*/
        while ((data = fileReader.read())!=-1){
            char data1 = (char) data;
            System.out.print(data1);
        }
        fileReader.close();
    }

    @Test
    public void writerFirst() throws IOException {
        String writer = "D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\writer.txt";
        FileWriter fileWriter = new FileWriter(writer,true);
        String content ="风雨之后，一定见彩虹";

        int len;
        char[] chars = new char[4];
        /*1.可以在上面加上true的形式，默认是在后面追加数据
        *   写数据直接，可以在里面放一个字符串，把字符串写入到文件中*/
        fileWriter.write(content);
        /*2.需要关闭，不关闭的话，字符串中的数据，没有办法写入到文件中*/
        fileWriter.close();
    }
}
