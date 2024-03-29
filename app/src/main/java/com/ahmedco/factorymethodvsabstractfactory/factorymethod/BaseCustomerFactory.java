package com.ahmedco.factorymethodvsabstractfactory.factorymethod;


public abstract class BaseCustomerFactory{

    public ICustomer GetCustomer() {
        ICustomer myCust = this.CreateCustomer();
        myCust.AddPoints();
        myCust.AddDiscount();
        return myCust;
    }

    public abstract ICustomer CreateCustomer();

}