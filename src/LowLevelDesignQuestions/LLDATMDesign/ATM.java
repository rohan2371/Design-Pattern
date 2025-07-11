package LowLevelDesignQuestions.LLDATMDesign;

import LowLevelDesignQuestions.LLDATMDesign.ATMStates.ATMState;
import LowLevelDesignQuestions.LLDATMDesign.ATMStates.HasCardState;
import LowLevelDesignQuestions.LLDATMDesign.ATMStates.IdleState;

public class ATM {

    private static ATM atmObject = new ATM();   //Singleton: eager initialization
    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM(){}

    public void setCurrentATMState(ATMState atmState) {
        this.currentATMState = atmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public static ATM getAtmObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;

    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int withdrawalAmountRequest) {
        atmBalance = atmBalance - withdrawalAmountRequest;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }


    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }

}
