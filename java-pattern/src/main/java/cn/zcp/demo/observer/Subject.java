package cn.zcp.demo.observer;

import java.util.*;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-25 16:41
 * @describe designpattern-demo
 *
 * 被观察者（被观察者也可以抽象出来）
 */
public class Subject {

    //被观察者拥有所有观察者的对象
    Set<Observer> observers = new HashSet<>();
    //name-observer
    //Map<String,Observer> maps = new HashMap<>();

    public void attach(Observer observer){
        if(observers.add(observer)){
            System.out.println("添加观察者:"+observer.name);
        }else{
            System.out.println("观察者:"+observer.name+",已经存在,不重复添加!");
        }
    }

    public void notifyAllObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
