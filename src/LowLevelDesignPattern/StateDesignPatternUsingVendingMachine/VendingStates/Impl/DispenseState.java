package LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates.Impl;

import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Coin;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Item;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingMachine;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates.State;

import java.util.List;

public class DispenseState implements State {

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }


    @Override
    public void clickOnPressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");

    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");

    }
}
