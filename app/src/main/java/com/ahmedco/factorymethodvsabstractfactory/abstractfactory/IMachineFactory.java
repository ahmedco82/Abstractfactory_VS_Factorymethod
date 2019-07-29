package com.ahmedco.factorymethodvsabstractfactory.abstractfactory;

public interface IMachineFactory {
    IProcessor GetRam();
    IHardDisk GetHardDisk();
    IMonitor GetMonitor();
}
