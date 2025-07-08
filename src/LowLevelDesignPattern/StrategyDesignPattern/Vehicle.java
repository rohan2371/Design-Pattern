package LowLevelDesignPattern.StrategyDesignPattern;

import LowLevelDesignPattern.StrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    // this is known as constructor injection
    Vehicle (DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
