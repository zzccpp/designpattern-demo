package cn.zcp.demo.observer;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 16:33
 * @describe designpattern-demo
 *
 * 正在观看股票
 */
public class StockObserver extends Observer {

    public StockObserver(String name) {
        super(name);
    }

    @Override
    void update() {
        System.out.println(name+"关闭股票,开始工作....");
    }
}
