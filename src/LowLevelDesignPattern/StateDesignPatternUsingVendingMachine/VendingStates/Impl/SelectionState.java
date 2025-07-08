package LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates.Impl;

import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Coin;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Item;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingMachine;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates.State;

import java.util.List;

public class SelectionState implements State {
    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnPressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");

    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        return;

    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        //1. get item of this codeNumber
        Item item = machine.getInventory().getItem(codeNumber);

        //2. total amount paid by User
        int paidByUser = 0;
        for(Coin coin : machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()) {

            if(paidByUser > item.getPrice()) {
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }

    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");

    }
}
