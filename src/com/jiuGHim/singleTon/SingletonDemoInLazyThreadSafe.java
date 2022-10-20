package com.jiuGHim.singleTon;

/**
 * 线程安全的懒汉单例模式
 */
public class SingletonDemoInLazyThreadSafe {

    /**
     * 私有实例,初始化的时候不加载（延迟加载）
     */
    private static SingletonDemoInLazyThreadSafe instance;

    /**
     * 私有构造
     */
    private SingletonDemoInLazyThreadSafe() {}

    /**
     * 公共获取实例方法（线程安全，调用效率低）
     * @return
     */
    public synchronized static SingletonDemoInLazyThreadSafe getInstance() {
        if(instance == null ) {
            instance = new SingletonDemoInLazyThreadSafe();
        }
        return instance;
    }
}