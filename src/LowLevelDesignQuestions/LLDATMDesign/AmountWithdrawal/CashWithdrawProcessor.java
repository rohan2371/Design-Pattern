package LowLevelDesignQuestions.LLDATMDesign.AmountWithdrawal;

import LowLevelDesignQuestions.LLDATMDesign.ATM;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.nextCashWithdrawProcessor = cashWithdrawProcessor;
    }

    public void withDraw(ATM atm,int remainingAmount){
        if(nextCashWithdrawProcessor != null){
            nextCashWithdrawProcessor.withDraw(atm,remainingAmount);
        }
    }


}
