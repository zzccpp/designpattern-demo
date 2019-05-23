package cn.zcp.demo.simplefactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 14:18
 * @describe designpattern-demo clinet
 *
 * 简单工厂:不是一个标准模式
 *
 */
public class Main {

    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();
        Car car = factory.createCar("audi");
        car.driverCar();
    }
}
