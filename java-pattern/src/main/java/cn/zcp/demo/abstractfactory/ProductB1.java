package cn.zcp.demo.abstractfactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:08
 * @describe designpattern-demo <描述>
 */
public class ProductB1 implements IProductB {
    @Override
    public void setName() {
        System.out.println("A>>Intel芯片...");
    }
}
