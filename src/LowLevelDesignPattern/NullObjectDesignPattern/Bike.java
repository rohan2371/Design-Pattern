package LowLevelDesignPattern.NullObjectDesignPattern;

public class Bike implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 12;
    }

    @Override
    public int getSeatCapacity() {
        return 2;
    }
}
