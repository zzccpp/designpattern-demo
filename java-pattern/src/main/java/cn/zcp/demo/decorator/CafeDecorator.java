package cn.zcp.demo.decorator;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 15:05
 * @describe designpattern-demo Cafe装饰
 */
public class CafeDecorator implements Cafe{

    private Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void makeCafe() {
        cafe.makeCafe();
    }
}
