package cn.zcp.demo.proxy.jdkproxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 23:28
 * @describe designpattern-demo
 *
 *  定义明星,定义需要被代理的对象
 */
public class StarPerson implements IPerson{

    @Override
    public void doWork() {
        System.out.println("明星接代言....");
    }

    @Override
    public String getName() {
        return "我是zcp";
    }
}
