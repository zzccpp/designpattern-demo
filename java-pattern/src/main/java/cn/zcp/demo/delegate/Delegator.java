package cn.zcp.demo.delegate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 17:40
 * @describe designpattern-demo
 *
 * 委托者
 *
 * – 保存Delegate的实例引用。
 *
 * – 实现Delegate的接口。
 *
 * – 将对Delegate接口方法的调用转发给Delegate。
 *
 */
public class Delegator {

    private Delegate delegate = new Delegate();

    public void getBag(){
        System.out.println("我很忙,已经委托B去拿快递了...");
        delegate.getBag();//委托B去拿快递
    }
}
