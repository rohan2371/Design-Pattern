package LowLevelDesignQuestions.LLDATMDesign.ATMStates;

import LowLevelDesignQuestions.LLDATMDesign.ATM;
import LowLevelDesignQuestions.LLDATMDesign.Card;

public class CheckBalanceState extends ATMState {
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance is: " + card.getBankBalance());
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");

    }
}
