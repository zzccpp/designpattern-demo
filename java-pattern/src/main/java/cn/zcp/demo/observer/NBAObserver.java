package cn.zcp.demo.observer;

import javax.naming.Name;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 16:33
 * @describe designpattern-demo
 *
 * 正在观看NBA
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name) {
        super(name);
    }

    @Override
    void update() {
        System.out.println(name+"关闭NBA,开始工作....");
    }
}
