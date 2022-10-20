package com.jiuGHim.singleTon;

/**
 * 饿汉单例模式
 */
public class SingletonDemoInHunger {

    /**
     * 私有实例，类初始化就加载
     */
    private static SingletonDemoInHunger instance = new SingletonDemoInHunger();

    /**
     * 私有构造方法
     */
    private SingletonDemoInHunger() {}

    /**
     * 公共的、静态的获取实例方法
     * @return 单例对象
     */
    public static SingletonDemoInHunger getInstance() {
        return instance;
    }

}