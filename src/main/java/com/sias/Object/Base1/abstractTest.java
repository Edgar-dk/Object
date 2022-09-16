package com.sias.Object.Base1;

import org.junit.jupiter.api.Test;

/**
 * @author Edgar
 * @create 2022-08-24 17:29
 * @faction:
 */
public class abstractTest {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        BB bb = new BB();
        bb.calculateTime();
    }
}
abstract class AABB {
    public abstract void job();//抽象方法
    public void calculateTime() {//实现方法，调用 job 方法 //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行任务的时间"+(end-start));
    }
}
class AA extends AABB {
    int num;
    public void job(){
        for (int i=1;i<=8000000;i++){
            num+=i;
        }
    }
}
class BB extends AABB{
    int num;
    public void job(){
        for (int i=1;i<=800000000;i++){
            num+=i;
        }
    }
}
