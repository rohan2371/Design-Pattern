package LowLevelDesignQuestions.LLDATMDesign.ATMStates;

import LowLevelDesignQuestions.LLDATMDesign.ATM;
import LowLevelDesignQuestions.LLDATMDesign.AmountWithdrawal.CashWithdrawProcessor;
import LowLevelDesignQuestions.LLDATMDesign.AmountWithdrawal.FiveHundredWithdrawProcessor;
import LowLevelDesignQuestions.LLDATMDesign.AmountWithdrawal.OneHundredWithdrawProcessor;
import LowLevelDesignQuestions.LLDATMDesign.AmountWithdrawal.TwoThousandWithdrawProcessor;
import LowLevelDesignQuestions.LLDATMDesign.Card;

public class CashWithdrawalState extends ATMState {

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }


    @Override
    public void cashWithdrawal(ATM atmObject, Card card, int withdrawalAmountRequest) {
        if(atmObject.getAtmBalance() < withdrawalAmountRequest){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if(card.getBankBalance() < withdrawalAmountRequest){
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs and 100rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withDraw(atmObject,withdrawalAmountRequest);
            exit(atmObject);
        }

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
