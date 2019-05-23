package cn.zcp.demo.singleton;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:20
 * @describe designpattern-demo
 * 饱汉式
 */
public class SingletonA {

    private final static SingletonA SINGLETON_A = new SingletonA();

    private SingletonA(){}

    public static SingletonA getInstance(){
        return SINGLETON_A;
    }

}
