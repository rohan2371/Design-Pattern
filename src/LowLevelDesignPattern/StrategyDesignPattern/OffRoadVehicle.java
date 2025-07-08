package LowLevelDesignPattern.StrategyDesignPattern;

import LowLevelDesignPattern.StrategyDesignPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
