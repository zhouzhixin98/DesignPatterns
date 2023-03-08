package com.jiuGHim.FactoryMethod.demo01;

/**
 * 具体产品（Concrete Product）角色
 * 这个角色实现了抽象产品角色所声明的接口。工厂方法模式所创建的每一个对象都是某个具体产品角色的实例。
 * @author jiughim
 */
public class ProductA implements Product {

    public String productType = "ProductA";

    private String productParameter = "A";

    @Override
    public String getProductType() {
        return productType;
    }

    public String getParameter() {
        return productParameter;
    }

    @Override
    public void doUse() {
        System.out.println("这是ProductA实现的功能");
    }

}