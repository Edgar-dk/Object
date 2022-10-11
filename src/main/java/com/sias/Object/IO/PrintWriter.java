package com.sias.Object.IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Edgar
 * @create 2022-10-11 13:44
 * @faction:
 */

/*一：字节的形式把数据输出*/
public class PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        out.println("dayinshuju");
        out.close();

        /*1.指定数据打印的位置*/
        String localtion="d:\\p.txt";
        System.setOut(new PrintStream(localtion));
        System.out.println("这个是把数据打印到TXT文件中");


    }


}
