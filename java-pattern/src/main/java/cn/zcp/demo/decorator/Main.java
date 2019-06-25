package cn.zcp.demo.decorator;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-23 18:21
 * @describe designpattern-demo
 *
 * 装饰模式
 *
 * 装饰器模式                             适配器模式
 * 是一种非常特别的适配器模式                可以不保留层级关系
 * 装饰着和被装饰者需要实现同一个接口,         适配者和被适配者没有必然的层级联系通常采用代理或者继承形式进行包装
 * 主要目的是为了扩展，依旧保留OOP关系
 *
 *  满足is-a的关系(实现同一个接口所以都是A意思)       满足has-a(组合模式,拥有被适配者对象)
 *
 *  注重的是覆盖、扩展                      注重兼容、转换
 *
 * ---------------------------------------------------------------
 * 包装流,DataSource对CONN的包装 ...
 * 带有Decorator   Wrapper 一般都是使用的装饰器模式
 *
 *
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 * 何时使用：在不想增加很多子类的情况下扩展类。
 * 如何解决：将具体功能职责划分，同时继承装饰者模式。
 * 关键代码： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
 * 应用实例： 1、孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 2、不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画、玻璃和画框形成了一个物体。
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 缺点：多层装饰比较复杂。
 * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 * 注意事项：可代替继承。
 *
 */
public class Main {

    public static void main(String[] args) {

        //制作一杯原味cafe
        PlainCafe plainCafe = new PlainCafe();

        //原味cafe加牛奶
        MilkCafeDecorator milkCafeDecorator = new MilkCafeDecorator(plainCafe);
        milkCafeDecorator.makeCafe();

        //原味cafe加糖
        SugarCafeDecorator sugarCafeDecorator = new SugarCafeDecorator(plainCafe);
        sugarCafeDecorator.makeCafe();

    }
}

































