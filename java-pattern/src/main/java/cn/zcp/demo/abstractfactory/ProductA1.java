package cn.zcp.demo.abstractfactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:07
 * @describe designpattern-demo <描述>
 */
public class ProductA1 implements IProductA {
    @Override
    public void setName() {
        System.out.println("A>>华硕主板...");
    }
}
