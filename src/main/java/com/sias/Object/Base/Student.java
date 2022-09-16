package com.sias.Object.Base;

/**
 * @author Edgar
 * @create 2022-08-12 10:37
 * @faction:
 */
public class Student extends Base{


    public Student() {
        super(12,"23","32");
        System.out.println("Student()无参数构造器被调用");

    }

    public Student(String address) {
        super(23,"ewe","32");
        System.out.println("Student(String address)有参数构造器被调用");

    }

    public int Test(){
        super.test01();
        return 3;
    }
    public static void main(String[] args) {
        Student student = new Student();
        int test = student.Test();
        System.out.println(test);
    }
}
