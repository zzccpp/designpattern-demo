package cn.zcp.demo.proxy.staticproxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 22:47
 * @describe designpattern-demo <描述>
 */
public class Main {

    public static void main(String[] args) {

        Person proxy = new StudentProxy(new Student());
        proxy.doJob();

    }
}
