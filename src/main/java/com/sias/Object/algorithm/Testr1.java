package com.sias.Object.algorithm;

/**
 * @author Edgar
 * @create 2022-08-27 8:52
 * @faction:
 */
public class Testr1 {

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Testr1 testr1 = new Testr1();
        int [] number ={2,7,8};
        int target=9;
        testr1.twoSum(number,target);
    }
}
