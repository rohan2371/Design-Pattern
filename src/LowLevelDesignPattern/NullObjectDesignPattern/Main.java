package LowLevelDesignPattern.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("CAR");
        System.out.println("Seating Capacity: "+ vehicle.getSeatCapacity());
        System.out.println("Tank Capacity: "+ vehicle.getTankCapacity());
    }
}
