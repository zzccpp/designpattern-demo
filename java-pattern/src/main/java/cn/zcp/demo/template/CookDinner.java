package cn.zcp.demo.template;

import java.net.CookieHandler;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 14:20
 * @describe designpattern-demo
 *
 * 做饭炒菜
 */
public abstract class CookDinner {
    /**
     * 洗锅,洗菜
     */
    void wash(){
        System.out.println("洗锅、洗菜...");
    }

    /**
     * 做菜
     */
    abstract void cookDishe();

    /**
     * 洗锅
     */
    void saBot(){
        System.out.println("做完起锅装盘...");
    }

    /**
     * 模板方法,为了防止恶意操作使用final修饰
     */
    public final void cook(){

        wash();

        cookDishe();

        saBot();
    }
}
