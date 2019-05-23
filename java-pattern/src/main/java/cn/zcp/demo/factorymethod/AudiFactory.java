package cn.zcp.demo.factorymethod;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 22:29
 * @describe designpattern-demo <描述>
 */
public class AudiFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
