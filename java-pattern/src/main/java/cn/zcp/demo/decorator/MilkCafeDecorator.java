package cn.zcp.demo.decorator;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 15:14
 * @describe designpattern-demo 咖啡加牛奶
 */
public class MilkCafeDecorator extends CafeDecorator {

    public MilkCafeDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public void makeCafe() {
        super.makeCafe();

        addMilk();
    }

    private void addMilk() {
        System.out.println("加牛奶...");
    }
}
