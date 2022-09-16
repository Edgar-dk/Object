package com.sias.Object.String;


import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author Edgar
 * @create 2022-09-14 17:10
 * @faction:
 */
public class test2 {
    public static void main(String[] args) {
        String name ="zhangsan";
        int g = name.indexOf("g");
        System.out.println(g);


        /*1.String装换成StringBuffer*/
        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println(stringBuffer);

        /*2.调用方法转换*/
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(name);
        /*3.StringBuffer转换成string
        *   直接调用tostring,或者是填写在构造器里面*/
        String s = stringBuffer.toString();
        String string = new String(stringBuffer);
    }

    @Test
    public void o(){

        String price = "232421423525.4565";
        StringBuffer priceBuffer = new StringBuffer(price);

        for (int i =priceBuffer.indexOf(".")-3; i>0; i -=3 ){
            priceBuffer=priceBuffer.insert(i,",");
        }

        System.out.println(priceBuffer);
    }
    @Test
    public void er(){
        int sum=0;
        for (int i =0;i<100;i++){
           sum+=i;
        }
        System.out.println(sum);
    }
}
