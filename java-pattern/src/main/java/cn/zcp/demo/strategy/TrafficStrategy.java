package cn.zcp.demo.strategy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 15:54
 * @describe designpattern-demo
 *
 * 交通工具策略
 */
@FunctionalInterface//添加作为函数编程
public interface TrafficStrategy {

    /**
     * 选择出行工具
     */
    void travelTools();

}
