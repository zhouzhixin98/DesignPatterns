package com.jiuGHim.FactoryMethod.demo01;


/**
 * 抽象产品类/接口
 * 工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
 * @author jiughim
 */
public interface Product {

    String productType = null;

    String getProductType();

    void doUse();

}