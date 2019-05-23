package cn.zcp.demo.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 23:45
 * @describe designpattern-demo
 *
 * 明星动态代理对象
 */
public class StarProxy implements InvocationHandler {
    //定义目标代理对象
    private static StarPerson starPerson;

    public IPerson getStarProxy(StarPerson starPerson) {
        this.starPerson = starPerson;

        IPerson proxy = (IPerson) Proxy.newProxyInstance(starPerson.getClass().getClassLoader(), new Class[]{IPerson.class}, this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("2我是明星经纪人,请先跟我谈,签合同....");
        Object methodReturn = method.invoke(starPerson, args);
        System.out.println("2代言完成,经纪人收钱...");
        return methodReturn;//方法返回值
    }


}
