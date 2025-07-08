package LowLevelDesignQuestions.LLDCarRentalSystems;

import LowLevelDesignQuestions.LLDCarRentalSystems.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(){
        // filtering vehicles based on the vehicle type
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // crud operations for vehicles
}
