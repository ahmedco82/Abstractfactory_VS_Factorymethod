package com.ahmedco.factorymethodvsabstractfactory.abstractfactory;

public class LowBudgetMachine implements IMachineFactory{


    @Override
    public IProcessor GetRam() {
        return new CheapProcessor();
    }

    @Override
    public IHardDisk GetHardDisk() {
        return new CheapHDD();
    }

    @Override
    public IMonitor GetMonitor() {
        return new LowResolutionMonitor();
    }
}
