package cn.zcp.demo.simplefactory;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-11 14:14
 * @describe designpattern-demo 汽车工厂类
 *
 * 缺点：每次增加一种car需要修改工厂类   违背封闭开放原则
 *
 */
public class CarFactory {

    private final static CarFactory carFactory = new CarFactory();
    private CarFactory(){}
    public static CarFactory getInstance(){
        return carFactory;
    }

    public Car createCar(String car){
        if(car.equals("audi")){
            return new AudiCar();
        }else if(car.equals("bmw")){
            return new BmwCar();
        }
        return null;
    }

}
