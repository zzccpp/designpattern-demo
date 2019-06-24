package cn.zcp.demo.strategy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 16:09
 * @describe designpattern-demo
 *
 * 去西藏旅游
 */
public class Travel {

    public void byTools(TrafficStrategy strategy){
        System.out.println("准备去西藏旅游,选择交通工具!");
        strategy.travelTools();
    }
}
