package LowLevelDesignQuestions.LLDATMDesign.ATMStates;

import LowLevelDesignQuestions.LLDATMDesign.ATM;
import LowLevelDesignQuestions.LLDATMDesign.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
