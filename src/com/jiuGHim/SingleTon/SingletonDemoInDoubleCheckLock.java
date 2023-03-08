package com.jiuGHim.SingleTon;

/**
 * 双重校验锁 单例模式
 */
public class SingletonDemoInDoubleCheckLock {

    /**
     * 私有实例，volatile关键字，禁止指令重排。
     */
    private volatile static SingletonDemoInDoubleCheckLock instance;

    /**
     * 私有构造
     */
    private SingletonDemoInDoubleCheckLock() {}

    /**
     * 公共获取实例方法（线程安全）
     * @return
     */
    public static SingletonDemoInDoubleCheckLock getInstance() {
        if(instance == null ) {
            // 一重检查
            synchronized (SingletonDemoInDoubleCheckLock.class) {
                if(instance == null) {
                    // 二重检查
                    instance = new SingletonDemoInDoubleCheckLock();
                }
            }
        }
        return instance;
    }
}