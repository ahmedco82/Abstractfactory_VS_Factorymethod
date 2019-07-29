package com.ahmedco.factorymethodvsabstractfactory.factorymethod;

import android.util.Log;

public class GoldCustomer implements ICustomer{

    public void AddPoints(){

    }

    public void AddDiscount(){

    }

    public void GoldOperation() {

        Log.i("Print0",""+"GoldOperation");
    }
}
