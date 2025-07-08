package LowLevelDesignPattern.StrategyDesignPattern;

import LowLevelDesignPattern.StrategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
