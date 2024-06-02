package Model;

import java.util.List;

public class ParkingFloor {
    
    List<ParkingSlot> parkingSlot;

    public ParkingFloor(List<ParkingSlot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public List<ParkingSlot> getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(List<ParkingSlot> parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
    
}
