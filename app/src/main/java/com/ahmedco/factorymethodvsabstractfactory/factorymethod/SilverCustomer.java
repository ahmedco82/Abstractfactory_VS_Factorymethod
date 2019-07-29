package com.ahmedco.factorymethodvsabstractfactory.factorymethod;

import android.util.Log;

public class SilverCustomer implements ICustomer {

    @Override
    public void AddPoints(){

    }
    
    @Override
    public void AddDiscount(){

    }
    public void SilverOperation(){
        Log.i("Print0",""+"SilverOperation");
    }
}
