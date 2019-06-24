package cn.zcp.demo.strategy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 16:07
 * @describe designpattern-demo
 *
 * 坐飞机
 *
 */
public class PlaneTools implements TrafficStrategy {
    @Override
    public void travelTools() {
        System.out.println("坐飞机...");
    }
}
