package cn.zcp.demo.proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-25 20:05
 * @describe designpattern-demo
 *
 * 明星代理对象
 *
 */
public class StarProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("经纪人谈合同....");
        Object resultObj = proxy.invokeSuper(o, args);
        System.out.println("经纪人谈终结合同....");
        return resultObj;
    }
}
