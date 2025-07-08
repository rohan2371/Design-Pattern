package LowLevelDesignPattern.StrategyDesignPattern;

import LowLevelDesignPattern.StrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }

}
