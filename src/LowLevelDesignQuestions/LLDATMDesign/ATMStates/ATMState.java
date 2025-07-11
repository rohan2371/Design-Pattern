package LowLevelDesignQuestions.LLDATMDesign.ATMStates;

import LowLevelDesignQuestions.LLDATMDesign.ATM;
import LowLevelDesignQuestions.LLDATMDesign.Card;
import LowLevelDesignQuestions.LLDATMDesign.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest){
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }


}
