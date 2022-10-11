package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author Edgar
 * @create 2022-10-10 20:13
 * @faction:
 */
/*一：这个类的目的是为了解决编码问题
 *    而产生的
 *    字节转换成字符
 *    数据到内存，还是内存到磁盘，都是字节转字符*/
public class StreamExchangeReader {
    public static void main(String[] args) throws IOException {
        String path = "D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\reader.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path), "gbk");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = null;
        while ( (s = bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        bufferedReader.close();
    }
    @Test
    public void Out() throws IOException {
        String write="d:\\t.txt";
        String charSet="utf-8";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(write),charSet);
        String content="写数据的方式，字节转换成字符";
        outputStreamWriter.write(content);
        outputStreamWriter.close();

    }
}
