package LowLevelDesignQuestions.LLDCarRentalSystems;

import LowLevelDesignQuestions.LLDCarRentalSystems.Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationStatus reservationstatus;
    ReservationType reservationType;
    Location location;


    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationstatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations



}
