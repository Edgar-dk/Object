package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author Edgar
 * @create 2022-09-20 14:28
 * @faction:
 */
public class BufferInputAndOnput {
    @Test
    public void InputAndOuput() throws IOException, InterruptedException {
        String read ="D:\\User1\\rundata\\document\\major\\UnderASophomore\\Test\\8.png";
        String write ="d:\\0.png";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(read));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(write));
        int len;
        byte[] bytes = new byte[1024];
        while ((len =bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
