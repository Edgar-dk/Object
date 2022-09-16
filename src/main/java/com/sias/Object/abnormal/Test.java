package com.sias.Object.abnormal;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Edgar
 * @create 2022-08-28 18:07
 * @faction:
 */
public class Test {
    public static void main(String[] args) {

        try {
            System.out.println("下面空指针异常");

            String name =null;
            int length = name.length();
            System.out.println("=======");

            System.out.println("下面是除数异常1");
            int i=10;
            int j=0;
            System.out.println("下面是除数异常2");
            int y =i/j;

        }catch (NullPointerException e){
            System.out.println(e.getMessage()+"空指针异常");
        }catch (ArithmeticException e1){
            System.out.println(e1.getMessage()+"除数异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class J{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        String inner = "";
        while (true){
            System.out.println("请输入一个整数");
            inner= scanner.next();
            try {
                num = Integer.parseInt(inner);
                /*1.只要是上面的数据变化处理正常的话，是可以继续往下面走的
                *   下面的是break，表示，跳出这个循环*/
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }

        }
    }


    public void re() throws Exception{
        te();
    }
    public void te () throws FileNotFoundException {

    }
}

