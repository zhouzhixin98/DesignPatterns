package com.jiuGHim.SingleTon;

/**
 * description: SingletonDemoInDoubleCheckLock2
 * date: 2022/10/20 17:34:24
 *
 * @author: zzx
 */

/**
 * 双重校验锁单例模式，去除volatile关键字
 */
public class SingletonDemoInDoubleCheckLock2 {

    /**
     * 没有volatile修饰实例
     */
    private static SingletonDemoInDoubleCheckLock2 instance = null;

    /**
     * 私有构造
     */
    private SingletonDemoInDoubleCheckLock2() {}

    /**
     * 公共获取实例方法
     * @return
     */
    public static SingletonDemoInDoubleCheckLock2 getInstance() {
        if (instance == null){
            synchronized (SingletonDemoInDoubleCheckLock2.class){
                if (instance == null){
                    instance = new SingletonDemoInDoubleCheckLock2();
                }
            }
        }
        return instance;
    }
}
