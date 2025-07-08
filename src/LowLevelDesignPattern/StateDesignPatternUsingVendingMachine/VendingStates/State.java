package LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingStates;

import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Coin;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.Item;
import LowLevelDesignPattern.StateDesignPatternUsingVendingMachine.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnPressInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;

    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;



}
