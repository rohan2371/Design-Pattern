package LowLevelDesignQuestions.LLDATMDesign;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 112211;
    BankAccount bankAccount;
    public boolean isCorrectPINEntered(int pin) {
        if(pin == PIN_NUMBER)
            return true;
        return false;
    }

    public int getBankBalance() {
        return bankAccount.balance;
    }

    public void deductBankBalance(int withdrawalAmountRequest) {
        bankAccount.withdrawalBalance(withdrawalAmountRequest);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
