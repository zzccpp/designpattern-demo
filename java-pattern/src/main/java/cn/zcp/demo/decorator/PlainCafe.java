package cn.zcp.demo.decorator;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 15:04
 * @describe designpattern-demo
 * 原味咖啡
 */
public class PlainCafe implements Cafe {

    @Override
    public void makeCafe() {
        System.out.println("制作了一杯原味咖啡!");
    }
}
