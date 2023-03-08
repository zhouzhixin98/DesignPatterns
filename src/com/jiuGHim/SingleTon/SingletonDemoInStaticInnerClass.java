package com.jiuGHim.SingleTon;

/**
 * 静态内部类单例模式
 */
public class SingletonDemoInStaticInnerClass {

    /**
     * 静态内部类
     */
    private static class InnerClass{
        // 初始化实例
        private final static SingletonDemoInStaticInnerClass INSTANCE = new SingletonDemoInStaticInnerClass();
    }

    /**
     * 私有构造
     */
    private SingletonDemoInStaticInnerClass() {}

    /**
     * 公关获取实例方法（线程安全，延迟加载）
     * @return
     */
    public static SingletonDemoInStaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }
}