package cn.zcp.demo.observer;

import java.util.Objects;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 16:24
 * @describe designpattern-demo 定义观察着
 */
public abstract class Observer {
    /**
     * 同事名称
     */
    protected String name;

    public Observer(String name) {
        this.name = name;
    }

    //default：默认的访问权限，也是可以省略的访问权限，它不仅能在设置了该权限的类中访问，也可以在同一包中的类或子类中访问。
    abstract void update();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Observer observer = (Observer) o;
        return Objects.equals(name, observer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
