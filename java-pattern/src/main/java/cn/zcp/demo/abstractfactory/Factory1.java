package cn.zcp.demo.abstractfactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:10
 * @describe designpattern-demo <描述>
 */
public class Factory1 implements IFactory {
    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
