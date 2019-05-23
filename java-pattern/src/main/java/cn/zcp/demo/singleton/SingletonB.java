package cn.zcp.demo.singleton;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:20
 * @describe designpattern-demo
 * 饱汉式
 */
public class SingletonB {

    private static SingletonB singletonB = null;

    private SingletonB(){}

    //线程不安全,不推荐使用
    /*public static SingletonB getInstance(){
       if(null!=singletonB){
           singletonB = new SingletonB();
       }
       return singletonB;
    }*/
    //线程安全,不推荐使用(效率太低了)
    /*public static synchronized SingletonB getInstance(){
        if(null!=singletonB){
            singletonB = new SingletonB();
        }
        return singletonB;
    }*/
    //线程安全,双重判断(可以使用)
    public static SingletonB getInstance(){
        if(null!=singletonB){
            synchronized (SingletonB.class){
                if(null!=singletonB) {
                    singletonB = new SingletonB();
                }
            }
        }
        return singletonB;
    }
}
