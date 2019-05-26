package cn.zcp.demo.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-25 20:17
 * @describe designpattern-demo
 *
 * cglib 无法代理privet方法.
 *
 */
public class Main {

    public static void main(String[] args) {

        StarProxy proxy = new StarProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SuperStar.class);
        enhancer.setCallback(proxy);

        SuperStar superStar = (SuperStar) enhancer.create();
        superStar.advocacy("手机");
        superStar.dothing();

        //-------------------------------------------、
        enhancer = new Enhancer();
        enhancer.setSuperclass(Main.class);
        enhancer.setCallback((MethodInterceptor) (o, method, args1, proxy1) -> {
            System.out.println("------------cglib1----------");
            Object resultObj = proxy1.invokeSuper(o, args1);
            System.out.println("------------cglib2----------");
            return resultObj;
        });
        Main main = (Main) enhancer.create();
        main.test();
    }

    public void test(){
        System.out.println("ddddddddddddddddddddddd");
    }
}
