package com.sias.Object.IO;

import com.sun.media.sound.SoftTuning;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;
import java.io.*;
import java.util.SortedMap;

/**
 * @author Edgar
 * @create 2022-09-16 16:52
 * @faction:
 */
public class createFile {

    /*1.创建文件*/
    @Test
    public void createFile() throws IOException {
        String newaddress="d:\\name.txt";

        /*01.new File是文件的意思这个文件是静态的
        *    你要对文件干什么呢，是删除呢，是创建呢，还是往文件里面
        *    写数据呢，这个是不知道的，光有了文件，需要有操作文件的动作
        *    下面的只是一个Java对象，只有执行了createNewFile的时候，才是往磁盘中创建文件*/
        File file = new File(newaddress);

        /*02.操作文件的动作
        *    这个是创建文件*/
        file.createNewFile();
        System.out.println("创建文件成功");
    }

    /*2.文件的相关方法*/
    @Test
    public void method(){
        File file = new File("d:\\name.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }

    /*3.文件和文件夹的创建*/
    @Test
    public void FileJ() throws IOException {
        String dirFile= "d:\\demo\\e\\r";
        File file = new File(dirFile);
        if (file.exists()==false){
            file.mkdirs();
            System.out.println("创建成功");
        }else {
            if (file.exists()==true){
                System.out.println("文件已存在");
            }else {
                System.out.println("创建失败");
            }
        }
    }

    /*4.读取文件
    *   按照单个字节的形式读取数据*/
    @Test
    public void readFile() throws IOException {
        String readFile ="d:\\name.txt";
        FileInputStream fileInputStream = new FileInputStream(readFile);
        int read = 0;
        /*fileInputStream是按照字节去读取的数据
        * 所以返回过来的数据，也是字节，也就是二进制的数据10形式的
        * 读取的是一个字节，然后给read，read可以把字节强转成字符，然后在输出这个
        * 字符，然后在去读取，知道满足条件，为-1，什么时候，满足条件，把所有的数据
        * 读完毕之后，在读一次数据，就变成了-1，就不在去读数据了*/
        while ((read = fileInputStream.read())!=-1){
            System.out.print((char)read);
        }
        fileInputStream.close();
    }

    /*5.读取多个字节*/
    @Test
    public void readFiles() throws IOException {
        String readFile ="d:\\name.txt";
        FileInputStream fileInputStream = new FileInputStream(readFile);
        /*01.设置8个字节的数组*/
        byte[] bytes = new byte[8];
        int len =0;
        /*02.读取数据的时候，一下子按照8个字节读取出来
        *    读多少个字节，把字节数目给len，可以一下子读取8个，
        *    假如说剩下的有2个，在遍历一次的话，len是2个字节
        *    把读取出来的数据放在bytes字节数组中，*/
        while ((len = fileInputStream.read(bytes))!=-1){

            /*03.将字节数组变成字符串，bytes是要变化的数据
            *    数据从0-len这么长，读取完数据之后，才结束*/
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }
        fileInputStream.close();
    }

    /*6.往文件中写数据*/
    @Test
    public void write() throws IOException {
        String write = "d:\\e.txt";
        /*01.尽管没有这个文件，会自动创建一个。
        *    并且往文件中写数据，按照字节的形式
        *    后面写true的话，表示在后面追加文件*/
        FileOutputStream fileOutputStream = new FileOutputStream(write,true);
        String na="Hello";
        /*02.在去写数据的时候，可以有一个指定的范围，0-3就是指定了范围
        *    从第i+1个开始，这个i是从0开始的，到j个结束，这个j是，从1开始的*/
        fileOutputStream.write(na.getBytes(),0,3);
        fileOutputStream.close();
    }

    /*7.读取文件和写入文件*/
    @Test
    public void readWrite() throws IOException {
        String readFile="D:\\User1\\rundata\\picture\\壁纸图片\\壁纸图片\\图片\\srvsetwp\\360wallpaper_dt.jpg";
        String writeFile = "d:\\ppphe.jpg";

        FileInputStream fileInputStream = new FileInputStream(readFile);
        FileOutputStream fileOutputStream = new FileOutputStream(writeFile);
        byte[] bytes = new byte[1024];
        int len =0;
        while ((len = fileInputStream.read(bytes))!=-1){
            /*01.读取的字节，直接写入文件中*/
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
