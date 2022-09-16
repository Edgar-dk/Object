package com.sias.Object.interfacerT;

/**
 * @author Edgar
 * @create 2022-08-27 11:03
 * @faction:
 */
public class transfor {
    public static void main(String[] args) {
         IF anIf= new Teacher();
         IG anIG =new Teacher();
    }
}
interface IF extends IG{
}
interface IG{
}
class Teacher implements IF{

}