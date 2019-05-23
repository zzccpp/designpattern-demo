package cn.zcp.demo.factorymethod;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 22:18
 * @describe designpattern-demo
 *
 * 工厂方法模式
 *
 */
public class Main {

    public static void main(String[] args) {

        AbstractFactory factory = new BmwFactory();

        factory = new AudiFactory();
        factory.doOption();
        /*Car car = factory.createCar();
        car.driverCar();*/
    }
}
