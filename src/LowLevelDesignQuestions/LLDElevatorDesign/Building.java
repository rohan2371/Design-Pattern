package LowLevelDesignQuestions.LLDElevatorDesign;

import java.util.List;

public class Building {
    List<Floor> floorList;

    public Building(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public void addFloor(Floor floor) {
        this.floorList.add(floor);
    }

    public void removeFloor(Floor floor) {
        this.floorList.remove(floor);
    }

    public List<Floor> getFloorList() {
        return floorList;
    }
}
