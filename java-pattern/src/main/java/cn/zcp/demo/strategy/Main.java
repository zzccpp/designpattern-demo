package cn.zcp.demo.strategy;

import java.awt.*;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-23 16:20
 * @describe designpattern-demo
 *
 * 1、最终返回结果一致
 * 2、执行逻辑过程不一致
 * [支付类型、登录方式、比较器、旅行路线]
 *
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 * 何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。
 * 如何解决：将这些算法封装成一个一个的类，任意地替换。
 * 关键代码：实现同一个接口。
 * 应用实例： 1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。 2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。 3、JAVA AWT 中的 LayoutManager。
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 * 使用场景： 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。 2、一个系统需要动态地在几种算法中选择一种。 3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 * 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
 *
 */
public class Main {

    public static void main(String[] args) {

        Travel travel = new Travel();
        travel.byTools(new CarTools());

        //使用枚举
        travel.byTools(TravelEnum.PLANETOOL.strategy);

        //使用Lambda函数编程
        travel.byTools(() -> System.out.println("步行去"));

        //使用Lambda函数编程
        travel.byTools(() -> {System.out.println("骑自行车");});


        //测试有参数Lambda调用
        LambdaB b = new LambdaB();
        b.doA((String a) -> {
            //参数a为b调用LambdaA方法时传的值
            System.out.println(a);
            return "ccc";//LambdaA中方法有返回值的时候需要填写return(如果这个表达式中不止一行时)
        });
        //b.doA((String a) ->""); 返回默认""


        //JDK自带的Lambda接口Predicate<T>、Consumer<T>，以及Function<T, R>，其余接口几乎都是对这三个接口的定制化
        b.doX((String str)->{
            if(str.equals("rrrr")) return true;
            return false;
        });

        /*TravelEnum[] values = TravelEnum.values();
        System.out.println(TravelEnum.CARTOOL.name);
        for(TravelEnum em : values) System.out.println(em);*/
    }
}





































