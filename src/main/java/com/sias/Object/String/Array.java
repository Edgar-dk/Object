package com.sias.Object.String;

import org.junit.jupiter.api.Test;

import javax.swing.table.TableModel;
import java.util.Arrays;

/**
 * @author Edgar
 * @create 2022-09-15 20:38
 * @faction:
 */
public class Array {
    @Test
    public void array(){
        /*0.toString直接输出
        *   数组里面的数据*/
        int []a ={1,3,5};
        System.out.println();
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void sort(){
        int [] b = {-1,-6,3,86,4};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
    /*1.自定义冒泡排序*/
    @Test
    public static void bubbling(int[] arr){
        int emp=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    emp=arr[j];

                }
            }
        }
    }

    /*2.查找索引的位置*/
    @Test
    public void indexOF(){
        /*01.查找索引，必须是有序的
        *    不能从大到小，只能从小到大*/
        int [] ad={1,2,5,78};
        int i = Arrays.binarySearch(ad, 2);
        System.out.println(i);

        int[] ints = Arrays.copyOf(ad, ad.length);
        /*02.直接打印的话，是一个地址
        *    需要里面的值，拷贝*/
        System.out.println(ints);
        System.out.println(Arrays.toString(ints));


        /*03.填充数组
        *    99把里面的数全部填充上*/
        Arrays.fill(ad,99);
        System.out.println(Arrays.toString(ad));
    }
}
