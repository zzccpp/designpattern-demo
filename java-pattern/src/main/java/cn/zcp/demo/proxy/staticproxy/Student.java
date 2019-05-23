package cn.zcp.demo.proxy.staticproxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 22:36
 * @describe designpattern-demo
 *
 * 真正被代理的对象
 */
public class Student implements Person {
    @Override
    public void doJob() {
        System.out.println("学生做作业...");
    }
}
