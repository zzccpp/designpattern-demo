package cn.zcp.demo.delegate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-23 17:07
 * @describe designpattern-demo
 *
 * 委派模式(属于行为模型)  而在J2EE开发中业务委托模式在已经作为了官方的一种设计模式。
 *
 * 应用场景：不属于 23 种设计模式之一，是面向对象设计模式中常用的一种模式。这种模式的原理为类 B
 * 和类 A 是两个互相没有任何关系的类，B 具有和 A 一模一样的方法和属性；并且调用 B 中的方法，属性
 * 就是调用 A 中同名的方法和属性。B 好像就是一个受 A 授权委托的中介。第三方的代码不需要知道 A 的
 * 存在，也不需要和 A 发生直接的联系，通过 B 就可以直接使用 A 的功能，这样既能够使用到 A 的各种功
 * 能，又能够很好的将 A 保护起来了，一举两得
 *----------------------------------------------
 *
 * 一般使用Dispatch  Delegate就是使用的委派模式.
 *
 * 委托与被委托中具有相同的方法与属性
 *
 * 相比代理模式，代理只是代理片面的(某一个功能),而委托这是全面的
 *
 */
public class Main {

    public static void main(String[] args) {

        Delegator delegator = new Delegator();
        delegator.getBag();
    }
}
