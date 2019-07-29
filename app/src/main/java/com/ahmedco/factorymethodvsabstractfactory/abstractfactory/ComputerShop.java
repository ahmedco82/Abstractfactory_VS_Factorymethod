package com.ahmedco.factorymethodvsabstractfactory.abstractfactory;

public class ComputerShop{

    IMachineFactory category;

    public ComputerShop(IMachineFactory _category) {

        category = _category;
    }

    public void AssembleMachine() {
        IProcessor processor = category.GetRam();
        IHardDisk hdd = category.GetHardDisk();
        IMonitor monitor = category.GetMonitor();
        //use all three and create machine
        processor.PerformOperation();
        hdd.StoreData();
        monitor.DisplayPicture();
    }
}