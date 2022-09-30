package com.sias.Object.IO;

import java.io.Serializable;

public class dog implements Serializable {
    private int i;
    private String p;

    public dog(int i, String string) {
        this.i = i;
        this.p = string;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "dog{" +
                "i=" + i +
                ", p='" + p + '\'' +
                '}';
    }
}