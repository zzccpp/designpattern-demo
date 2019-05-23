package cn.zcp.demo.proxy.staticproxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 22:37
 * @describe designpattern-demo
 *
 *  学生代理类
 *
 */
public class StudentProxy implements Person {

    /**
     * 持有具体被代理的对象
     */
    private Student realStudent;

    public StudentProxy(Student realStudent) {
        this.realStudent = realStudent;
    }

    @Override
    public void doJob() {
        System.out.println("代理对象doSomething...");
        realStudent.doJob();
        System.out.println("代理对象替完成!");
    }
}
