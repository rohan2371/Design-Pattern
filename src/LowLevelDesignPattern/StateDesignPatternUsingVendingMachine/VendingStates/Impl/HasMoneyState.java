package LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates.Impl;

import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Coin;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Item;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingMachine;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates.State;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnPressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
             System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);

    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());


    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");


    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();

    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");

    }
}
