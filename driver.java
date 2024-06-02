import java.util.Scanner;

import Model.Command;
import Model.DisplayType;
import Model.ParkingLot;
import Model.VehicleType;
import Service.ParkingLotService;

public class driver {

    public static void main(String[] args) {
        
        ParkingLotService parkingLotService = new ParkingLotService();

        while(true){
            Scanner scan = new Scanner(System.in);
            Command type = Command.of(scan.next());
            switch(type){
                case CREATE_PARKING_LOT : parkingLotService.createParkingLot(new ParkingLot(scan.next(), scan.nextInt(), scan.nextInt()));
                                            break;
                case PARK_VEHICLE : parkingLotService.parkVehicle(VehicleType.valueOf(scan.next()), scan.next(), scan.next());
                                        break;
                case UNPARK_VEHICLE : parkingLotService.unparkVehicle(scan.next());
                                        break;
                case DISPLAY :  parkingLotService.display(DisplayType.of(scan.next()),VehicleType.valueOf(scan.next()));
                                    break;
                case EXIT : return;
            }
        }
        
    }
}