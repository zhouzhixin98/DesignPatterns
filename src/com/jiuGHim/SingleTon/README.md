# 单例模式
1. 饿汉式
   1. 类加载时就初始化，浪费内存，不能延迟加载；
   2. 基于 classloader 机制避免了多线程的同步问题，线程安全；
   3. 没有加锁，调用效率高。
2. 懒汉式
   1. 线程不安全形式，可以做到延迟加载。
   2. 通过关键字synchronized声明公共的获取实例的方法getInstance()，可以确保线程安全，能做到延迟加载，但是效率不高。
3. double-checked locking（双重检查锁）
   1. 双重判断，延迟加载；
   2. 线程安全；
   3. JDK 版本要求1.5起。
4. 静态内部类
   1. 利用了classloader机制来保证初始化 instance 时只有一个线程，线程安全；
   2. 只有通过显式调用 getInstance 方法时，才会显式装载静态内部类，从而实例化instance，延迟加载。
5. 枚举类
   1. 这是实现单例模式的最佳方法。它更简洁，不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。但是它不是延迟加载的。