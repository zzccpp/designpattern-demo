package cn.zcp.demo.strategy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 17:38
 * @describe designpattern-demo
 * 使用枚举
 */
public enum TravelEnum {

    CARTOOL(new CarTools()),
    PLANETOOL(new PlaneTools());

    TrafficStrategy strategy;

    TravelEnum(TrafficStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "TravelEnum{" +
                "strategy=" + strategy +
                '}';
    }
}