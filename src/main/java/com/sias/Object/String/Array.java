package com.sias.Object.String;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Edgar
 * @create 2022-09-15 20:38
 * @faction:
 */
public class Array {
    @Test
    public void array(){
        int []a ={1,3,5};
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void sort(){
        int [] b = {-1,-6,3,86,4};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
