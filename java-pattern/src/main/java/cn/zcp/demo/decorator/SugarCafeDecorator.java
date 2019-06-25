package cn.zcp.demo.decorator;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 15:16
 * @describe designpattern-demo cafe加糖
 */
public class SugarCafeDecorator extends CafeDecorator {
    public SugarCafeDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public void makeCafe() {
        super.makeCafe();

        addSugar();
    }

    private void addSugar() {

        System.out.println("加糖...");
    }
}
