package main.adaptor.impl;

import main.adaptee.WeightMachine;
import main.adaptor.WeightMachineAdaptor;

public class WeightMachineAdapterImpl implements WeightMachineAdaptor {

    private final WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public float poundToKgs() {
        return (float) (weightMachine.weightInPounds()*0.45);
    }

}
