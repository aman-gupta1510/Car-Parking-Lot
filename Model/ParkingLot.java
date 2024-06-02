package Model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String parkingLotId;
    int numberOfFloors;
    int numberOfSlotsonEachFloor;
    List<ParkingFloor> parkingFloor;

    public ParkingLot(String parkingLotId,int numberOfFloors, int numberOfSlotsonEachFloor){
        this.parkingLotId = parkingLotId;
        this.numberOfFloors = numberOfFloors;
        this.numberOfSlotsonEachFloor = numberOfSlotsonEachFloor;
        this.parkingFloor = new ArrayList<ParkingFloor>(numberOfFloors);
    }

    public String getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfSlotsonEachFloor() {
        return numberOfSlotsonEachFloor;
    }

    public void setNumberOfSlotsonEachFloor(int numberOfSlotsonEachFloor) {
        this.numberOfSlotsonEachFloor = numberOfSlotsonEachFloor;
    }

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
    

}
