package LowLevelDesignQuestions.LLDElevatorDesign;

import LowLevelDesignQuestions.LLDElevatorDesign.util.Direction;

public class Floor {
    int floorNumber;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        this.externalDispatcher = new ExternalDispatcher();
    }

    public void pressButton(Direction direction){
        externalDispatcher.submitExternalRequest(floorNumber,direction);
    }
}
