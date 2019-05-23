package cn.zcp.demo.factorymethod;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 14:13
 * @describe designpattern-demo <描述>
 */
public class BmwCar implements Car {

    @Override
    public void driverCar() {
        System.out.println("开着宝马车...");
    }
}
