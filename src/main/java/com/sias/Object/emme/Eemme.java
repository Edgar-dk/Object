package com.sias.Object.emme;

/**
 * @author Edgar
 * @create 2022-08-28 9:03
 * @faction:
 */
public class Eemme {
    public static void main(String[] args) {
        Emme di = Emme.DI;
        System.out.println(di.name());
        System.out.println(di.ordinal());
        Emme[] values = Emme.values();
        for (Emme value : values) {
            System.out.println(value);
        }
        System.out.println(Emme.Of.compareTo(Emme.Fl));
    }
}
enum Emme{
    /*1.设置static，是让类可以直接去调用，
     *   调用一次去创建一次对象，使用final目的是为了
     *   保持这个对象只有一个，下次去调用的时候，不用在去
     *   创建对象了，只保持一个的原则，只只用get目的是只读
     *   文本数据，不用set，就是不去修改数据了，在调用
     *   对象的时候，就直接去调用toString方法了
     *   构造器私有化了，防止在外面创建这个对象*/
/*    public final static Test AUM = new Test("夏天", 12);
    public final static Test FL = new Test("冬天", 134);
    public final static Test DO = new Test("秋天", 153);
    public final static Test rew = new Test("春天", 132);*/
    /*2.使用关键字
    *   写在变量的前面，中间用逗号隔开*/
    Fl("春天",23),DI("夏天",43),Of("d",23);
    private String name;
    private int age;
    private Emme(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}