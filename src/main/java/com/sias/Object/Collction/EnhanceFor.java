package com.sias.Object.Collction;

/**
 * @author Edgar
 * @create 2022-10-04 9:14
 * @faction:
 */
public class EnhanceFor {
    public static void main(String[] args) {
        int i [] ={1,4,6,8,3};
        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.println(i[i1]);
        }
        for (int i1 : i) {
            System.out.println(i1);
        }
    }
}
