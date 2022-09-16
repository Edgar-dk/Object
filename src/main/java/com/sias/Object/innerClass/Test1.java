package com.sias.Object.innerClass;

/**
 * @author Edgar
 * @create 2022-08-27 16:17
 * @faction:
 */
public class Test1 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
    }
}
interface Bell{
    public void ring();
}
class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
