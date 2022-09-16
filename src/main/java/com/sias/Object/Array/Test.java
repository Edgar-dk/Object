package com.sias.Object.Array;

/**
 * @author Edgar
 * @create 2022-08-27 19:58
 * @faction:
 */
public class Test {

    public static void main(String[] args) {
        int Max = 0;
        int[] a = {4, -1, 9, 23, 10};
        int indexof = 0;
        for (int i = 0; i < a.length; i++) {
            if (Max < a[i]) {
                Max = a[i];
                indexof = i;
            }
        }
        System.out.println(Max + "=====" + indexof);
    }

    @org.junit.jupiter.api.Test
    public void test() {
        int[] a = {1, 2, 3};
        for (int i = 0; i < a.length; i++) {
        }
    }
}
