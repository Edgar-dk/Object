package com.sias.Object.abnormal;

import javax.swing.text.html.CSS;
import java.util.Scanner;

/**
 * @author Edgar
 * @create 2022-08-28 19:37
 * @faction:
 */
public class custom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int anInt = Integer.parseInt(next);
        if (!(anInt > 10 && anInt < 120)) {
            throw new II("请输入在指定范围的数据");
        }
        System.out.println("你的年龄正确");
    }
}

class II extends RuntimeException {
    public II(String message) {
        super(message);
    }
}
class dd{
    public static void main(String[] args) {
        try {
            if (!(args.length==2)){
                throw new ArrayIndexOutOfBoundsException("个数不正确");
            }
            int anInt = Integer.parseInt(args[0]);
            int anInt1 = Integer.parseInt(args[1]);
            int throe = dd.throe(anInt, anInt1);
            System.out.println(throe);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage()+"参数的格式不正确");
        }catch (ArithmeticException e){
            System.out.println("出现了除数0的异常情况");
        }
    }
    public static int throe(int n1,int n2){
        return n1/n2;
    }
}