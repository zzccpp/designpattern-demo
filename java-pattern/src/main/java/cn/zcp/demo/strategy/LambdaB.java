package cn.zcp.demo.strategy;

import java.util.function.Predicate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 16:27
 * @describe designpattern-demo <描述>
 */
public class LambdaB {

    public String doA(LambdaA a){

        //String test = a.getName("test");
        return "---";
    }

    public void doX(Predicate<String> p){
        boolean xxxxx = p.test("xxxxx");
        System.out.println(xxxxx);
    }
}
