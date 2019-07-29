package com.ahmedco.factorymethodvsabstractfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.ahmedco.factorymethodvsabstractfactory.abstractfactory.ComputerShop;
import com.ahmedco.factorymethodvsabstractfactory.abstractfactory.HighBudgetMachine;
import com.ahmedco.factorymethodvsabstractfactory.abstractfactory.IMachineFactory;
import com.ahmedco.factorymethodvsabstractfactory.factorymethod.BaseCustomerFactory;
import com.ahmedco.factorymethodvsabstractfactory.factorymethod.GoldCustomerFactory;
import com.ahmedco.factorymethodvsabstractfactory.factorymethod.ICustomer;

// https://www.youtube.com/watch?v=4m7IuLM4wdw
// https://www.codeproject.com/Articles/716413/Factory-Method-Pattern-vs-Abstract-Factory-Pattern

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Example1();
        Example2();
    }


    private void Example2(){
        // Client Code .......................
        // Abstract  Factory .................
        IMachineFactory factory = new HighBudgetMachine();
        // Or new LowBudgetMachine();
        ComputerShop shop = new ComputerShop(factory);
        shop.AssembleMachine();
    }


    private void Example1(){
        /*
        Factory Method Pattern:
        In this pattern we define an interface which will expose a method
        which will create objects for us. Return type of that
        method is never be a concrete type rather it will be
        some interface (or may be an abstract class)
        انتر فيس تحتوى على داله من خلالها تحدد الكائانات لنا
        */
        //Client Code
        BaseCustomerFactory c = new GoldCustomerFactory();
        // Or new SilverCustomerFactory();
        ICustomer objCust = c.GetCustomer();
    }
}
