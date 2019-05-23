package cn.zcp.demo.factorymethod;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 22:27
 * @describe designpattern-demo 抽象工厂
 *
 * 定义为接口或者抽象，抽象的话就可以事先做一些共有的事情
 *
 */
public abstract class AbstractFactory {

    abstract Car createCar();

    public void doOption(){
        Car car = createCar();
        car.driverCar();
    }
}
