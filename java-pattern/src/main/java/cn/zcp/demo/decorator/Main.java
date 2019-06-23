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
 *
 *
 *
 *
 */
public class Main {
}
