package com.jiuGHim.FactoryMethod.demo01;

/**
 * 具体工厂（Concrete Creator）角色
 * 担任这个角色的是实现了抽象工厂接口的具体类。具体工厂角色含有与应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 * @author jiughim
 */
public class CompanyA implements Company {

    @Override
    public Product bulidProduct(String Parameter) {

        if (Parameter.equals("A")) {
            return new ProductA();
        } else if (Parameter.equals("B")) {
            return new ProductB();
        } else {
            return null;
        }

    }

}