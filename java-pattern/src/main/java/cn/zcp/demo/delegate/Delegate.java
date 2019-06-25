package cn.zcp.demo.delegate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 17:40
 * @describe designpattern-demo
 *
 * 被委托着  – 接受Delegator的调用，帮助Delegator实现其接口
 */
public class Delegate {

    public void getBag(){
        System.out.println("B去拿快递");
    }
}
