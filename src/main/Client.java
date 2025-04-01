package main;

import main.adaptee.WeightMachine;
import main.adaptee.impl.WeightMachineForBabies;
import main.adaptor.WeightMachineAdaptor;
import main.adaptor.impl.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineForBabies();
        System.out.println("In pounds "+weightMachine.weightInPounds());
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdapterImpl(weightMachine);
        System.out.println("In Kgs "+weightMachineAdaptor.poundToKgs());
    }
}
