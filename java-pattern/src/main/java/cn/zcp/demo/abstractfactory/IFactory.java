package cn.zcp.demo.abstractfactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 23:09
 * @describe designpattern-demo <描述>
 */
public interface IFactory {

    IProductA createProductA();

    IProductB createProductB();
}
