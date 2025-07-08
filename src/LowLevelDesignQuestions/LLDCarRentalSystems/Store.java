package LowLevelDesignQuestions.LLDCarRentalSystems;

import LowLevelDesignQuestions.LLDCarRentalSystems.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storelocation;
    List<Reservation> reservations = new ArrayList<>();

    public Store(VehicleInventoryManagement inventoryManagement){
        this.inventoryManagement = inventoryManagement;
    }
    public List<Vehicle> getVehicles(){
        return inventoryManagement.getVehicles();
    }

    //addVehicles, update vehicles, use inventory management to update those.
    public void setVehicles(List<Vehicle> vehicles) {
       inventoryManagement.setVehicles(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    // just call update and delete  reservation from the reservation class method




}
