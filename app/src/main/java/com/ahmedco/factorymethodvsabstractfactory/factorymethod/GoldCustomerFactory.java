package com.ahmedco.factorymethodvsabstractfactory.factorymethod;


public class GoldCustomerFactory extends BaseCustomerFactory {

    @Override
    public ICustomer CreateCustomer() {
        GoldCustomer objCust = new GoldCustomer();
        objCust.GoldOperation();
        return objCust;
    }
}
