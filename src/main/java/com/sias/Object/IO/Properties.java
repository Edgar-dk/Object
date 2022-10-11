package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Edgar
 * @create 2022-10-11 14:52
 * @faction:
 */
public class Properties {
    public static void main(String[] args) throws IOException {
        java.util.Properties properties = new java.util.Properties();
        properties.load(new FileReader("D:\\User1\\rundata\\document\\major\\UnderASophomore\\FBDCode\\Java\\JavaBase\\Object\\src\\main\\java\\com\\sias\\Object\\mysql.properties"));
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user+"    "+pwd);
    }

    @Test
    public void setProperties() throws IOException {
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("user","汤姆");
        properties.setProperty("12","pwd");
        /*1.后面的null是往这个文件中写入数据的注释
        *   一般在最上面显示*/
        properties.store(new FileOutputStream("src\\p.properties"),null);
        System.out.println("成功");
    }
}
