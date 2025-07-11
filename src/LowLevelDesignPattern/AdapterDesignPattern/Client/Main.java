package LowLevelDesignPattern.AdapterDesignPattern.Client;

import LowLevelDesignPattern.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import LowLevelDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import LowLevelDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
