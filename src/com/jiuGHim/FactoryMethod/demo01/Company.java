package com.jiuGHim.FactoryMethod.demo01;


/**
 * 抽象工厂类/接口
 * 任何在模式中创建对象的工厂类必须实现这个接口。
 * @author jiughim
 */
public interface Company {

    Product bulidProduct(String Parameter);

}