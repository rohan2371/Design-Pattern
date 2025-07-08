package LowLevelDesignQuestions.LLDCarRentalSystems;

import LowLevelDesignQuestions.LLDCarRentalSystems.Product.Vehicle;

import java.util.List;

public enum ReservationType {
    HOURLY,
    DAILY;

    public static class Store {
        int storeId;
        VehicleInventoryManagement inventoryManagement;
        Location location;
        List<Reservation> reservations;


        public void setVehicles(List<Vehicle> vehicles){
            inventoryManagement = new VehicleInventoryManagement(vehicles);
        }


    }
}
