package cn.zcp.demo.strategy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 16:03
 * @describe designpattern-demo
 *
 * 自驾游策略
 */
public class CarTools implements TrafficStrategy {
    @Override
    public void travelTools() {
        System.out.println("自驾游...");
    }
}
