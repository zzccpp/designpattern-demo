package cn.zcp.demo.factorymethod;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 22:30
 * @describe designpattern-demo <描述>
 */
public class BmwFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BmwCar();
    }
}
