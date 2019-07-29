package com.ahmedco.factorymethodvsabstractfactory.abstractfactory;

public class AverageBudgetMachine extends LowBudgetMachine{

    @Override
    public IProcessor GetRam() {
        return new ExpensiveProcessor();
      //  return super.GetRam();
    }
}
