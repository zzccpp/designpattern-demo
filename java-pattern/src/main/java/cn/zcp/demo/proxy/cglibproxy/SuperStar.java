package cn.zcp.demo.proxy.cglibproxy;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-25 19:59
 * @describe designpattern-demo
 *
 * 超级明星
 */
public class SuperStar {

    /**
     * 代言广告advertis
     * @param advertis 广告
     */
    public void advocacy(String advertis){
        System.out.println("超级明星代言"+advertis);
    }

    public void dothing(){
        System.out.println("超级明星做事....");
    }

}
