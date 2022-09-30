package com.sias.Object.String;

import java.math.BigDecimal;

/**
 * @author Edgar
 * @create 2022-09-29 20:15
 * @faction:
 */
public class BigInteger {
    public static void main(String[] args) {
        java.math.BigInteger bigInteger = new java.math.BigInteger("99999999999999999999999");
        java.math.BigInteger bigInteger1 = new java.math.BigInteger("10");
        java.math.BigInteger add = bigInteger.add(bigInteger1);
        /*1.加法*/
        System.out.println(add);
        /*2.减法*/
        java.math.BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        /*3.乘法*/
        java.math.BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        /*4.除法*/
        java.math.BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);
        /*5.在使用小数，除法的时候，除不尽的话，出现异常
            除不近的时候，保留除数的位数，有三位，保留三位
        * on-terminating decimal expansion; no exact representable decimal result.
	at java.math.BigDecimal.divide(BigDecimal.java:1693)*/
        BigDecimal bigDecimal = new BigDecimal("9.90999999999999999999999999999999999999");
        BigDecimal bigDecimal1 = new BigDecimal("1.88888888888888888888888");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
