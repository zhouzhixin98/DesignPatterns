package com.jiuGHim.FactoryMethod.demo01;

/**
 * @author jiughim
 */
public class Client {

    public static void main(String[] args) {

        Company company = new CompanyA();

        //根据传入的参数得到ProductA产品
        Product product = company.bulidProduct("A");
        product.doUse();

        //根据传入的参数得到ProductB产品
        product = company.bulidProduct("B");
        product.doUse();
    }
}