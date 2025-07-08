package LowLevelDesignQuestions.LLDElevatorDesign;

import LowLevelDesignQuestions.LLDElevatorDesign.util.Direction;

import java.util.List;

public class ExternalDispatcher {
    public void submitExternalRequest(int floor, Direction direction) {

        List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

        // for simplicity, i am following even odd algorithm
        for(ElevatorController elevatorController : elevatorControllerList) {

            int elevatorID = elevatorController.elevatorCar.id;
            if (elevatorID%2==1 && floor%2==1){
                elevatorController.submitExternalRequest(floor,direction);
            } else if(elevatorID%2==0 && floor%2==0){
                elevatorController.submitExternalRequest(floor,direction);

            }
        }

    }
}
