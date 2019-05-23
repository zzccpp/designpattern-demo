package cn.zcp.demo.simplefactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 14:10
 * @describe designpattern-demo <描述>
 */
public class AudiCar implements Car {
    @Override
    public void driverCar() {

        System.out.println("开着奥迪轿车...");
    }
}
