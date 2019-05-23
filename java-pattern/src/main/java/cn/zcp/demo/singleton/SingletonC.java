package cn.zcp.demo.singleton;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:29
 * @describe designpattern-demo
 *
 * 使用内部类来实现;
 *
 *
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。不同的地方在饿汉式方式* 是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在* 需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 优点：避免了线程不安全，延迟加载，效率高。
 *
 *
 * 运行输出结果是：
 * 静态代码块！-->非静态代码块！-->默认构造方法！-->普通方法中的代码块！
 *
 */
public class SingletonC {


    static{
        System.out.println("静态语句块.......");
    }
    {
        System.out.println("非静态语句块......");
    }

    private SingletonC(){
        System.out.println("构造方法....");
    }

    static class SingletonInstance{
        private final static SingletonC SINGLETONC = new SingletonC();
        static{
            System.out.println("子类静态语句块....");
        }
    }
    public static SingletonC getInstance(){
        return SingletonInstance.SINGLETONC;
    }

}
