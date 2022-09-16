package com.sias.Object.Base;

/**
 * @author Edgar
 * @create 2022-08-24 14:46
 * @faction:
 */
class singletonL {
    public static void main(String[] args) {
        dd instance = dd.getInstance();
        System.out.println(instance.name);
    }
}
class dd{
    public String name;
    /*0.私有的对象，在外部使用不了，
     *   只可以在内部使用，所有定义成static，
     *   可以在内部直接返回这个对象
     *   静态相关的类，在被调用的时候，只被加载一次*/
    private static dd sf = new dd("小红");
    /*1.创建一个私有的构造器
     *   防止在外部，用这个类创建对象
     *   在外部new 类的时候，会调用构造器，私有了
     *   就不能再外部创建对象了，*/
    private dd(String name) {
        this.name = name;
    }
    /*2.创建的是一个静态的方法，只有
     *   静态的才可以调用静态的对象，返回的是一个对象
     *   的地址,外界可以通过一个类名直接调用这个方法，
     *   从而获取这个对象，私有的对象是为了访问其他*/
    public static dd getInstance(){
        return sf;
    }
}


