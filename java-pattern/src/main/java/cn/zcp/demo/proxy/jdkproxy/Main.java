package cn.zcp.demo.proxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-23 23:29
 * @describe designpattern-demo
 *
 * 1、拿到被代理对象的引用，并获取到它的所有接口反射获取
 * 2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理所有实现的所有方法
 * 3、动态生成JAVA代码,把新加的业务逻辑方法有一定的逻辑代码去调用
 * 4、重新生成新的JAVA代码  .class
 * 5、再重新加载到JVM中运行
 * //---------以上这个过程就叫代码重组
 *
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
        System.out.println(proxy.getClass());
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
        System.out.println(proxy.getClass());

        //把代理对象保存至文件
        try {
            byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{proxy.getClass()});

            FileOutputStream fos = new FileOutputStream("E:/$Proxy0.class");
            fos.write($Proxy0s);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
