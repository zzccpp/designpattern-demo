package cn.zcp.demo.template;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-23 16:27
 * @describe designpattern-demo
 *
 * 模板模式(模板方法模式)
 * 流程步骤一致,其中有些具体操作有不同.
 * [jdbcTemplate..]
 *
 * 意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 *
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 *
 * 使用场景： 1、有多个子类共有的方法，且逻辑相同。 2、重要的、复杂的方法，可以考虑作为模板方法。
 *
 * 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
 *
 */
public class Main {

    public static void main(String[] args) {

        CookDinner cook = new CookFish();
        cook.cook();

        cook = new CookMeat();
        cook.cook();
    }
}
