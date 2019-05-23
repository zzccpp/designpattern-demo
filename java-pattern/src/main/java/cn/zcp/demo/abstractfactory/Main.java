package cn.zcp.demo.abstractfactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:12
 * @describe designpattern-demo
 *
 * 针对的是产品族.
 */
public class Main {

    public static void main(String[] args) {

        IFactory factory = new Factory1();
        IProductA productA = factory.createProductA();
        IProductB productB = factory.createProductB();

        productA.setName();
        productB.setName();
    }
}
