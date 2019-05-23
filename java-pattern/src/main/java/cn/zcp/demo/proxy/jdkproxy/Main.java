package cn.zcp.demo.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 23:29
 * @describe designpattern-demo <描述>
 */
public class Main {

    public static void main(String[] args) {

        //定义需要被代理的对象
        final StarPerson starPerson = new StarPerson();

        //1.定义明星动态代理对象
        IPerson proxy = (IPerson) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{IPerson.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                System.out.println("我是明星经纪人,请先跟我谈,签合同....");
                Object methodReturn = method.invoke(starPerson, args);
                System.out.println("代言完成,经纪人收钱...");
                return methodReturn;//方法返回值
            }
        });
        //第一种:
        proxy.doWork();
        System.out.println("--------------------");
        String name = proxy.getName();
        System.out.println(name);
        System.out.println("=================================================");
        //第二种:
        proxy = new StarProxy().getStarProxy(starPerson);
        proxy.doWork();
        System.out.println("--------------------");
        name = proxy.getName();
        System.out.println(name);
    }
}
