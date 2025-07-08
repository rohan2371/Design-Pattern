package LowLevelDesignQuestions.LLDCarRentalSystems;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalBillAmount = calculateTotalBill();
        this.isBillPaid = false;
    }

    private double calculateTotalBill() {

        // apply the logic to calculate the bill based on the reservation type and duration
        return 100.00;
    }

    // add logic to pay the bill from the payment class
}
