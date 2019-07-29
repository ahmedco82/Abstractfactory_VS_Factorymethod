package com.ahmedco.factorymethodvsabstractfactory.abstractfactory;

public class HighBudgetMachine implements IMachineFactory {

    @Override
    public IProcessor GetRam(){
        return new ExpensiveProcessor();
    }

    @Override
    public IHardDisk GetHardDisk() {
        return new ExpensiveHDD();
    }

    @Override
    public IMonitor GetMonitor(){
        return new HighResolutionMonitor();
    }
}
