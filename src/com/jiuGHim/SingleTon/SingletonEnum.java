package com.jiuGHim.SingleTon;

/**
 * 枚举类
 */
public enum SingletonEnum {

    // 枚举元素本身就是单例 
    INSTANCE;


    /**
     * 其他要执行的方法
     */
    public void sayHello() {
        System.out.println("你好");
    }
//    ......
}
