package LowLevelDesignQuestions.LLDElevatorDesign;

import LowLevelDesignQuestions.LLDElevatorDesign.util.Direction;
import LowLevelDesignQuestions.LLDElevatorDesign.util.ElevatorState;

public class ElevatorCar {

    int id;
    ElevatorDisplay display;
    InternalButtons internalButtons;
    ElevatorState state;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        display = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        state = ElevatorState.IDLE;
        currentFloor = 0; // Assuming ground floor is 0
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }

    public void showDisplay(){
            display.showDisplay();
    }

    public void setDisplay(){
        this.display.setDisplay(currentFloor,elevatorDirection);
    }

    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }


}
