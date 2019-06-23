package cn.zcp.demo.singleton;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:20
 * @describe designpattern-demo
 *
 *
 * Listener本身单列、IOC容器、
 *
 */
public class Main {

    public static void main(String[] args) {

        SingletonC singletonC = SingletonC.getInstance();
    }
}
