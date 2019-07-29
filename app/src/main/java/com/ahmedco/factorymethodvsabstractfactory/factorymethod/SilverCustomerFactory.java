package com.ahmedco.factorymethodvsabstractfactory.factorymethod;

public class SilverCustomerFactory extends BaseCustomerFactory{


    @Override
    public ICustomer CreateCustomer() {
        SilverCustomer objCust = new SilverCustomer();
        objCust.SilverOperation();
        return objCust;
    }
}
