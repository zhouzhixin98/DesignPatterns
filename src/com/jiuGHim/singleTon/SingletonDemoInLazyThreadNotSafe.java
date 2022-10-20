package com.jiuGHim.singleTon;

/**
 * 线程不安全懒汉单例模式
 */
public class SingletonDemoInLazyThreadNotSafe {

    /**
     * 私有实例,初始化的时候不加载（延迟加载）
     */
    private static SingletonDemoInLazyThreadNotSafe instance;

    /**
     * 私有构造
     */
    private SingletonDemoInLazyThreadNotSafe() {}

    /**
     * 公共获取实例方法（线程不安全）
     * @return
     */
    public static SingletonDemoInLazyThreadNotSafe getInstance() {
        if(instance == null ) {
            // 使用的时候加载
            instance = new SingletonDemoInLazyThreadNotSafe();
        }
        return instance;
    }
}