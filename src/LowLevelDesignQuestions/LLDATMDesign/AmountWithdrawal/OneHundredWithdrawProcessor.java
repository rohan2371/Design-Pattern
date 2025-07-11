package LowLevelDesignQuestions.LLDATMDesign.AmountWithdrawal;

import LowLevelDesignQuestions.LLDATMDesign.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{
    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {
        int required =  remainingAmount/100;
        int balance = remainingAmount%100;

        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        }
        else if(required > atm.getNoOfOneHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required-atm.getNoOfOneHundredNotes()) * 100;
        }

        if(balance != 0){
            super.withDraw(atm, balance);
        }

    }
}
